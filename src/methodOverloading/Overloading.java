package methodOverloading;

public class Overloading {
  public void best () {
	 System.out.println("No value");
 }
  public void best(int x) {
	  System.out.println("Int value");
  }
  public void best (char c) {
	  System.out.println("Charecter value" );
  } 
  public void best (String s) {
	  System.out.println("string value");
  }
	public static void main(String[] args) {
 Overloading obj= new Overloading();
 obj.best();
 obj.best(10);
 obj.best('a');
 obj.best("fire");
 
	}

}
