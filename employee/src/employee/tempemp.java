package employee;

public class tempemp extends emp {
	int days;
	
	
	public tempemp(String n, String s, String a, double sa,int d) {
		super(n, s, a, sa);
		days=d;
		// TODO Auto-generated constructor stub
	}
	public double calculatenetsalary() {
		return(days*getSalary()/30);
	}
	
	public String toString() {
		return "tempemp[days=" +days+",name="+name+",surname="+surname+",address="+ address+"]"+"days"+days;				}
     

    public static void main(String[] args) {
    	tempemp e = new tempemp("sai","hie","kiul",1000,15);
    	System.out.println(e.calculatenetsalary());
    	System.out.println(e);
    	
    	
    }
   
	

}
