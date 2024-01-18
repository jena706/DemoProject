package tryncatch;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
    try {
		System.out.println(38/0);
    }
    catch(Exception e) {
    	System.out.println("valid data");
    	
    }
    finally {
    	System.out.println("check everything");
    }
    	 
    
	}

}
