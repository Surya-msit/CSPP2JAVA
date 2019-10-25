package employee;

public class emp {
	String name;
	String surname;
	String address;
	private double salary;
	
	public emp(String n, String s,String a,double sa) {
		name=n;
		surname=s;
		address=a;
		salary=sa;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
