package shape;

 class Circle extends shape {
	 double radius;
	 double pi=3.14;
	 public Circle(double d) {
		 radius =d;
	 }
	 public double getArea() {
		 return pi*radius*radius;
	 }
}
