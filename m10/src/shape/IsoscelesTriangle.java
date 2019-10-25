package shape;

class IsoscelesTriangle extends Triangle{
	double b,h;
	
	public IsoscelesTriangle(double b,double h) {
		this.b=b;
		this.h=h;
	}
	 
	double getArea() {
		return ((b*h)/2);
	}

}
