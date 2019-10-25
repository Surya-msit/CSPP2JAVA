package shapeproblem;

public class Cube extends RectangularShape {
    public Cube() { 
    // write code here
    	length=0;
    }

    public Cube(double size) { 
    // write code here 
    	length=size;
    }
    public double getArea() {
    	return 6*length*length;
    }
    public double getVolume() {
    	return length*length*length;
    }

    public String toString() { 
        return "For this cube all sides = " + super.getLength(); 
    } 
}



//Client to test them all! 
public class Shape3D_Client { 
    public static final int MAX = 6; 
    public static void main(String[] args) { 
        Shape3D[] shapes = new Shape3D[MAX]; 
// create all objects withe respective consturctors
// display 


       
    } 
}

}
