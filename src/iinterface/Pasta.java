package iinterface;

public class Pasta implements Maggie {
           public void m1() {
        	   System.out.println("MASALA");
           }
           public void m2() {
        	   System.out.println("NAMAK");
           }
           public void m3() {
        	   System.out.println("KHEERA");
           }
           public void m4() {
        	   System.out.println("ICE CREAM");
           }
	public static void main(String[] args) {
                 Pasta obj =new Pasta();
                 obj.m1();
                 obj.m2();
                 obj.m3();
                 obj.m4();
	}

}
