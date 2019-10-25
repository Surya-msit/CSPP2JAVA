package shape;

 class Square extends Quadrilateral {
	double a;
	
	public Square(double a) {
		this.a=a;
	}
	double getArea() {
		return (a*a);
	}
	
}
 
