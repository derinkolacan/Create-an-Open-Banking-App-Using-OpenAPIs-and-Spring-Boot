package com.example.demo;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/transactions/{accountNumber}")
public class TransactionController {
	//How to return a result as JSON format?
	//As you have annotated with @RestController there is no need to do explicit JSON conversion.
	
	TransactionService t = new TransactionService();
	
	public TransactionController(TransactionService t) {
		this.t = t;
	}
	@GetMapping
	public List<Transaction> derin(@PathVariable int accountNumber) {
		return t.findAllByAccountNumber(accountNumber);
	}

}
