
public class Account {
	String name;
    int accountnumber;
    private double balance;
    
    public  Account(String n,int a,double b) {
    	name = n;
    	accountnumber = a;
    	balance = b;
    	    	
    }
    
     public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
    	 balance = balance +amount;
     }
     public void withdraw(double amount) {
    	 if(amount <= balance) {
    	 balance = balance-amount;
     }else {
    	 System.out.println("Insufficient balance");
     }
     }
     public double getbalance() {
    	 return balance;
     }
     
 }
