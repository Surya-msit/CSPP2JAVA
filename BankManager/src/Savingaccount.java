
public class Savingaccount extends Account {
	float Interest;

	public Savingaccount(String n, int a, double b,float i) {
		super(n, a, b);
		Interest =i;
		// TODO Auto-generated constructor stub
	}
	 public void interest() {
		 double percent = super.getBalance()*Interest;
		 super.setBalance(percent+super.getBalance());
		 
		 
	 }
	 

}

 
