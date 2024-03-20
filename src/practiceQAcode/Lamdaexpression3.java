package practiceQAcode;

public class Lamdaexpression3 {
       interface cab {
    	   public String book (String Source , String Destination);
       }
	public static void main(String[] args) {
      cab cab = (Source, Destination) ->
      {System.out.println("cab booked for"+Source+"to"+Destination+"biju");
      return ("price 2100");
      };
      System.out.println(cab.book("Source", "Destination"));
	}

}
