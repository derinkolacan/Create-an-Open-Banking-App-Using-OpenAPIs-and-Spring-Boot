package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	public List<Transaction> findAllByAccountNumber(final int accountNumber) {
		
		if(accountNumber > 1000) {
			return List.of(new Transaction("Credit", 2021, 1905, "$", 10.000, "Ilker", ".png"));
		}
		else {
			return List.of(new Transaction("Credit", 2021, 1905, "$", 10.000, "Derin", ".png"));
		}
		
		
		
	}
	
	

}

