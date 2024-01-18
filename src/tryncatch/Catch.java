package tryncatch;

public class Catch {

	public static void main(String[] args) {
     try {
		System.out.println(12/0);
     }
     catch(Exception e) {
    	 System.out.println("PRINT THIS");
     }
    		finally {
    			System.out.println("everything is ok");
    		}
	
	}

}
