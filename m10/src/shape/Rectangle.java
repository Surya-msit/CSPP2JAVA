package shape;

class Rectangle extends  Quadrilateral {
	double w,l;
	
	public Rectangle(double w,double l) {
		this.w=w;
		this.l=l;
	}
	double getArea() {
		return (w*l);
	}

}
