package tryncatch;

public class AB {

	public static void main(String[] args) {
		try {
			   System.out.println(10/0);
		} catch (Exception e) {
                System.out.println(10/5);
		}
		finally {
			System.out.println("we can divide catch block");
		}
            
	}

}
