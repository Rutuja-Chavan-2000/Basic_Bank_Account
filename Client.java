package com.bankAccount;

public class Client {

	public static void main(String[] args) {
		Account aa=new Account("1234",0.0,"ABC","abc@gmail.com","9999999");
		aa.DepositMoney(2000);
		aa.WithDrawMoney(100);
		

	}

}
