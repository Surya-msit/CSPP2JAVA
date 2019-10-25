package inheritance;

class A1{
	
	int a;
	int b;
	
	public void input()
	{
		a=10;
		b=20;
	}

	public void display() 
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class B1 extends A1{
	int c;
	public void sum()
	{
		c= a + b;
		System.out.println(c);
	}
	
}
public class single {
public static void main(String[] args) {
	B1 b = new B1();
	b.input();
	b.display();
	b.sum();
	
	
	}
}
