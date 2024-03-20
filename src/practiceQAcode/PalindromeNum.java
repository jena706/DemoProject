package practiceQAcode;

public class PalindromeNum {

	public static void main(String[] args) {
             int num = 3113;
              int save = num ; 
              int rev = 0, rem ;
              while (save>0) {
            	  rem = save %10;
            	  rev = rev*10+rem;
            	  save= save /10;
              }
              {
            	  if ( num ==rev) {
            		  System.out.println("num is palindrome="+num);
            	  }
            	  
             	 }
            	
              }
	}


