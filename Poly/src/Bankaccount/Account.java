package Bankaccount;

public class Account {
	int  accountnumber;
	private double balance;
	
	public Account(int act,double balance ) {
		accountnumber= act;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
   public boolean credit(double tot) {
	   balance=(tot - balance);
	   return true;	   
   }
   public boolean debit(double amount) {
	   if(balance<amount) {
		   System.out.println("insufficient balance");
		   return(false);
		   else {
			   balance-=amount;
			   return(true)
		   
	   }
   }
   
}
}
