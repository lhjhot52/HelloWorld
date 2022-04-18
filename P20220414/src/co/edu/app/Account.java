package co.edu.app;

public class Account {
	// 필드 : 계좌번호, 예금주, 잔액 
	private String ano; 
	private String owner;
	private int balance;
    // 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	public void depositBalance(int balance) { 
		this.balance = this.balance + balance;
	}
    public void withdrawBalance(int balance) {
    	this.balance = this.balance - balance; 
    	}
	
	}
	

	
	// Getter,Setter


