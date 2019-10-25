package Bankaccount;

public class check extends Account {
	double fee;
	
	public check(int act, double balance,double fee) {
		super(act,balance);
		this.fee=fee;
	}
	
	public boolean credit(double amount) {
		if(credit(amount)==true)
			setBalance(getBalance()-fee);
		    return true;
	}
	public boolean debit(double amount) {
		if(debit(amount)==true)
			setBalance(getBalance()-fee);
		    return true;
	}
}

}
