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

class C1 extends B1{
	int d;
	
	public void mul( ) {
		d=a*b*c;
		System.out.println(d);
	}
	
}



public class multi {
public static void main(String[] args) {
	C1 c = new C1();
	c.input();
	c.display();
	c.sum();
	c.mul();
	
	
	}
}
