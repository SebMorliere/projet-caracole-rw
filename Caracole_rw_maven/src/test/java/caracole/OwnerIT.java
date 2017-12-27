package caracole;

import com.SCP.caracole.Owner;
import com.jayway.restassured.http.ContentType;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.http.HttpStatus;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OwnerIT {

    private static final String USER_ENDPOINT = "/users/";

    @Test
    public void test1CreateUser() {
        Owner owner = new Owner("1234", "SuperChien", "human");
        given().contentType(ContentType.JSON).body(owner)
                .when().post(USER_ENDPOINT)
                .then().assertThat().statusCode(equalTo(HttpStatus.OK.value()));
    }

    @Test
    public void test2CreateUser() {
        when().get(USER_ENDPOINT).then()
                .body("[0].id", equalTo("1234"))
                .body("[0].name", equalTo("SuperChien"))
                .body("[0].type", equalTo("human"));
    }
}
