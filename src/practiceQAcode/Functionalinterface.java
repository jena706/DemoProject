package practiceQAcode;
  
   interface cab
   {
	   public String bookedcab (String source , String destination);
   }
	 

public class Functionalinterface {

	public static void main(String[] args)
	{
      cab dop = 
    (source , destination)->{ System.out.println("Ola cab is booked"+source+"To"+destination);
	 return ("Price is :5000");
       };
       System.out.println(dop.bookedcab("source", "destination"));
	
	}
    
}

	
