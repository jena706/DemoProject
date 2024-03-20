package practiceQAcode;

public class TryCatch {
            public static void main (String args []) {
            	try {
            		   System.out.println(10/0);
				} catch (Exception e) {
					System.out.println("make it correct");
					
				}
            	finally {
					System.out.println("its solved");
				}
            	
            }
}
