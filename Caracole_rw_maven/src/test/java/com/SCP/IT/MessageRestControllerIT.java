package com.SCP.IT;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class MessageRestControllerIT {

    @Test
    public void test0GetMessage() {
        String msg = "hello";
        get("/message/" + msg)
                .then().assertThat().body("message", equalTo(msg));
    }
}