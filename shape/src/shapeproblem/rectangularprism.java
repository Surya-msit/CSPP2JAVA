package shapeproblem;

public class rectangularprism extends shape3D {
	    private double length; 
	    private double width; 
	    private double height;

	    public void RectangularPrism() { 
	      // write code here 
	    }

	    public void RectangularPrism(double l, double w, double h) { 
	      // write code here 2 * (length * width + width * height + length * height);
	    	System.out.println( 2 * (length * width + width * height + length * height));
	    }

	       public double getLength() { 
	      // write code here  length * width * height;
	    	   return length * width * height;
	    	   
	    }

	    public double getWidth() { 
	       // write code here 
	    	return width;
	    }

	     public double getHeight() { 
	        return height; 
	    }

	    public double getArea() { 
	        // write code here 
	    	return length*width;
	    }

	    public double getVolume() { 
	       // write code here 
	    	return length * width *height;
	    }

	    public String toString() { 
	        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height; 
	    }

	    public boolean equals(Object obj) { 
	       // write code here use instance of operator
	    	return true;
	    } 
	}


