package entities;

import exceptions.ex17DomainException;

public class ex17Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	//Constructor
	public ex17Account() {
	}
	public ex17Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	//Get an Set
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	//Methods
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(Double amount) {
		if(amount > withdrawLimit) {
			throw new ex17DomainException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new ex17DomainException("Not enough balance");
		}
	}
}
