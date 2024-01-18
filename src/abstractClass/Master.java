package abstractClass;

public class Master extends Pro {
	
	public void m1() {
		System.out.println("METHOD1");
	}

	
	public void m2() {
		System.out.println("METHOD2");
		
	}

	
	public void m3() {
		System.out.println("METHOD3");
		
	}
	
	public static void main(String[] args) {
            	Master obj = new Master();
            	obj.m1();
            	obj.m2();
            	obj.m3();
            	obj.m4();
	}



}
