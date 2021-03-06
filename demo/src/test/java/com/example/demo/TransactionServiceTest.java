package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {
	
	TransactionService ts = new TransactionService();
	
	@Test
	public void testAdd() throws Exception{
	    assertEquals(1, ts.findAllByAccountNumber(12345).size());
	}

}
