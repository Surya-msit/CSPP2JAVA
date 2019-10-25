package sample.surya.java;

 class Addition {
	public int sum(int x,int y) {
		return x+y;
	}
	
	public float sum(float x,float y) {
		return x+y;
	}
    public double sum(double x,double  y) {
     	return x+y;
    }
}

public class Overloading {
	public static void main(String[] args) {
		Addition a= new Addition();
		int r1=a.sum(10, 20);
		float r2=a.sum(30.0f, 20.0f);
		double r3=a.sum(50.0, 20.0);
		
		System.out.println("int"+r1);
		System.out.println("float"+r2);	
		System.out.println("double"+r3);
	}

}
