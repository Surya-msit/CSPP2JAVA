package employee;

public class fulltime extends tempemp {
	float pf;

	public fulltime(String n, String s, String a, double sa, int d,float p) {
		super(n, s, a, sa, d);
		pf=p;
		// TODO Auto-generated constructor stub
	}
	public double calculatenetsalary() {
		return(getSalary() + (getSalary()*pf/100));
	}
	public String toString() {
		return "fulltime[days=" +days+",name="+name+",surname="+surname+",address="+ address+"]"+"days"+days+"pf"+pf;				}
     
	public static void main(String[] args) {
    	fulltime e = new fulltime("sai","hie","hyd",1000,30,(float)1.25);
    	System.out.println(e.calculatenetsalary());
    	System.out.println(e);
	}
		
}
