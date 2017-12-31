package com.SCP.IT;

import com.SCP.caracole.Owner;
import com.jayway.restassured.http.ContentType;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.http.HttpStatus;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OwnerRestControllerIT {

    private static final String OWNER_ENDPOINT = "/owners/";

    @Test
    public void test1PostOwner() {
        Owner owner = new Owner("SuperChien", "HUMAN");
        given().contentType(ContentType.JSON).body(owner)
                .when().post(OWNER_ENDPOINT)
                .then().assertThat().statusCode(equalTo(HttpStatus.OK.value()));
    }

    @Test
    public void test2GetOwner() {
        when().get(OWNER_ENDPOINT).then()
                .body("[0].name", equalTo("SuperChien"))
                .body("[0].type", equalTo("human"));
    }
}
