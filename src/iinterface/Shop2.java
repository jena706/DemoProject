package iinterface;

public class Shop2 implements Shop {
     
	public void R1() {
		System.out.println("CHOCO");
	}
		public void R2() {
		System.out.println("COFFE");
		
	}
		public void R3() {
			System.out.println("CAKE");
		}
	    
	
	public static void main(String[] args) {
           Shop2 obj= new Shop2();
           obj.R1();
           obj.R2();
           obj.R3();
	}

}
