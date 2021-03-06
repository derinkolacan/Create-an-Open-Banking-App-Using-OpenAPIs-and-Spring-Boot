package com.example.demo;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class TransactionComponentTest {
	
	@LocalServerPort
	private int port;
	
	@Test
    public void componentTest() throws Exception{
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:8080/transactions/12345", port))
                .then()
                .statusCode(Matchers.is(200));
    }

	

}
