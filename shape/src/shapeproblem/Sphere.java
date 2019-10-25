package shapeproblem;

public class Sphere extends shape3D {
	private double radius;

    public Sphere() { 
        radius = 0; 
    }

    public Sphere(double r) { 
        radius = r; 
    }

    public double getRadius() { 
        return radius; 
    }

    public double getArea() { 
        // write code here  4 * Math.PI * Math.pow(radius, 2); 
    	return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() { 
        // write code here  4.0 * Math.PI * Math.pow(radius, 3) / 3.0; 
    	return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }

    public String toString() { 
        return "The radius of this sphere = " + radius; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
    	return true;
    } 
}


