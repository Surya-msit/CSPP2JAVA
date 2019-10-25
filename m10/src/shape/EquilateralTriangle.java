package shape;

class EquilateralTriangle extends Triangle {
	double a;
	
	public EquilateralTriangle(double a) {
		this.a=a;
		
	}
	double getArea() {
		return((Math.sqrt(3)/4)*(a*a));
	}

}
