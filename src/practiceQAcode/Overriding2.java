package practiceQAcode;

public class Overriding2 extends Overriding {
	  public void access() {
		   System.out.println("PAGE CAN'T ACCESS");
	   }
	public void username() {
		System.out.println("ENTER WRONG USERNAME");
	}
	public void main () {
		System.out.println("ENTER WRONG PASSWORD");
		
	}
	public static void main(String[] args) {
         Overriding2 obj= new Overriding2();
         obj.login();
         obj.access();
         obj.username();
         obj.main();
	}

}
