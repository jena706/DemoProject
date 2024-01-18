package iinterface;

public class Stay implements X {
public void m1() {
	System.out.println("no value");
}
public void m2() {
	System.out.println("take argu");
}
public void m3() {
	System.out.println("Hello ");
}

	public static void main(String[] args) {
    Stay obj = new Stay();
    obj.m1();
    obj.m2();
    obj.m3();
	}

}
