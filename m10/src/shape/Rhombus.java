package shape;

class Rhombus extends  Quadrilateral {
	double b,l;
	
	public Rhombus(double b,double l) {
		this.b=b;
		this.l=l;
	}
	double getArea() {
		return ((b*l)/2);
		
	}

}
