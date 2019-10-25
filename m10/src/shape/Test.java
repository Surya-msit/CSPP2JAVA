
package shape;

class Test {
	public static void main(String args[]) {
		shape[] S=new shape[6];
		S[0]= new Circle(1);
		S[1]=new EquilateralTriangle(2);
		S[2]=new Square(1);
		S[3]=new Rhombus(5,1);
		S[4]=new Rectangle(3,1);
		S[5]=new IsoscelesTriangle(3,1);
		System.out.println(S[0].getArea());
		System.out.println(S[1].getArea());
		System.out.println(S[2].getArea());
		System.out.println(S[3].getArea());
		System.out.println(S[4].getArea());
		System.out.println(S[5].getArea());
		
	}
	}