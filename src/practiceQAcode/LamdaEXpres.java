package practiceQAcode;

public class LamdaEXpres {
	interface cab  {
		public 	String booked (String Source , String destination);
	}

	public static void main(String[] args) {
		cab cab =(Source, destination) -> {System.out.println("cab booked"+Source+"TO"+destination+"delhi");
	
		return("price300");
		};
		System.out.println(cab.booked("Source", "destination"));

	}
	

}
