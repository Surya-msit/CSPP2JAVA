class A2
{
	public void m1()
	{
		System.out.println("hello");
	}

}
class B2 extends A2{
	public void m1()
	{
		System.out.println("hai");
	}
   	
}



public class Runtimetest {
	public static void main(String [] args) {
		A2 a = new A2();
		a.m1();
		
		B2 b = new B2();
		b.m1();
		
		A2 x = new B2();
		x.m1();
	}
	

}
