package practiceQAcode;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class FunctionalInterface233 {
	 
    interface cab  
    {
  	    public String car (String update , String ok );
     }
	public static void main(String[] args) {
           cab cab = (update, ok) -> {System.out.println("ola cab is booked ="+update+"to delhi="+ok);
        	return ("price 200");
           };
           System.out.println(cab.car("update", "ok"));
           
        			}
	}


