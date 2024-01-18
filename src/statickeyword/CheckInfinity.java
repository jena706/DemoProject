package statickeyword;

public class CheckInfinity {
  public void add () {
	  System.out.println(10+20);
  }
	 public void m1 () {
		 System.out.println(26+878);
	 }
	  
  
	public static void main(String[] args) {
		
		CheckInfinity obj = new CheckInfinity ();
	obj.add();   //reusability
	obj.m1();  //reusability
	}

}
