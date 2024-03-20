package practiceQAcode;

public class LamdaWITHOIUTsemicolon {
	 interface cab {
		 public void cabooked();
	 }

	public static void main(String[] args) {
             cab cab = ()->System.out.println("ola cab is booked");
             cab.cabooked();
	}

}
