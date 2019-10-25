/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */
package ClockADT;
public class Clock {
	public int hours;
	public int minutes;
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    public Clock(int h, int m) {
    	if ((h<24 && h>=0) && (m<60 && m>=0)) {
    		hours =h;
    		minutes=m;
    		
    	}

    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
    	String c[]=s.split(":");
    	hours =Integer.parseInt(c[0]);
    	minutes =Integer.parseInt(c[1]);

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
    	if (minutes <10 && hours>10) {
    		return hours+ ":0" + minutes;
    	}
    	else if (minutes >10 && hours<10) {
    		return "0"+hours+ ":" + minutes;
    	}
    	else if (minutes <10 && hours<10) {
    		return "0"+hours+ ":0" + minutes;
    	}
    	else {
    		return hours+":"+minutes;
    	}

    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
    	if (that.hours>this.hours || that.minutes >this.minutes) {
    		return true;
    	}
    	else
    	{
    		return false;
    	}
        
    }

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
    	if(minutes==60)
    	{
        hours++;
        minutes=00;
       }
    	else if(minutes==60 && hours==24) {
    		minutes++;
    		hours=00;
    	}
    	else {
    		minutes++;
    	}
        
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
    	for(int i=0;i<delta;i++) {
    		tic();
    	}
        
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}