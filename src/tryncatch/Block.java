package tryncatch;

public class Block {

	public static void main(String[] args) {
       try {  
		System.out.println(10/0);
       } 

	catch (Exception e)
       {
	System.out.println("solution..");
       }
finally 
{
	System.out.println("this code will excute every time");
}

       
     }
}