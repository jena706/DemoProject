package practiceQAcode;

public class Lamdaexprssion {
  interface num {
    	  public String sum (String source , String destination);
      }

	public static void main(String[] args) {
		num ride = (source, destination) ->
		{System.out.println("delhi"+source+"to"+destination+"mumbai");
			return("price 300");
			};
		
    System.out.println(ride.sum("source", "destination"));
	}

}
