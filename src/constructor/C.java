package constructor;

public class C {
public C() {
	System.out.println("fly");
}
public C (int x) {
	System.out.println("int value");
	
}
public C (String s) {
	System.out.println("I AM A CONSTRUCTOR");
}
	public static void main(String[] args) {
		C obj= new C();
		C obj1=new C (22);
		C obj2=new C ("S");
	}

}
