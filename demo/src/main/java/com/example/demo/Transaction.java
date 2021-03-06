package com.example.demo;


public class Transaction {
	
	
	private String type;
	private int date;
	private int accountNumber;
	private String currency;
	private double amount;
	private String merchantName;
	private String merchantLogo;
	
	public Transaction(String type, int date, int accountNumber, String currency, double amount, String merchantName,
			String merchantLogo) {
		this.type = type;
		this.date = date;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.amount = amount;
		this.merchantName = merchantName;
		this.merchantLogo = merchantLogo;
	}

	public String getType() {
		return type;
	}

	public int getDate() {
		return date;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCurrency() {
		return currency;
	}

	public double getAmount() {
		return amount;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public String getMerchantLogo() {
		return merchantLogo;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", date=" + date + ", accountNumber=" + accountNumber + ", currency="
				+ currency + ", amount=" + amount + ", merchantName=" + merchantName + ", merchantLogo=" + merchantLogo
				+ "]";
	}
	
	

}

