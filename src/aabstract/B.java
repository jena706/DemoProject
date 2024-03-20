package aabstract;

public class B extends A {

	public void m1() {
		System.out.println("hello");
	}

	
	public void m2() {
		System.out.println("right");
	}

	public static void main(String[] args) {
		B obj = new B ();
		obj.m1();
		obj.m2();

	}

	
}
