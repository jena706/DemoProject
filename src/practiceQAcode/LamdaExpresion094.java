package practiceQAcode;

public class LamdaExpresion094 {
	  interface cab {
		  public String booked (String location, String destination);
	  }

	public static void main(String[] args) {
         cab cab = (location, destination) ->
         { System.out.println("cab is booked from delhi"+location+"to mumbai"+destination);
           return("price 899");
        	  
            };
           System.out.println(cab.booked("location", "destination"));
         
	}

}
