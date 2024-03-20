package practiceQAcode;

public class Palindrome3 {

	public static void main(String[] args) {
       int num =2992;
       int save = num;
       int rev =0;
       int rem ;
       
       while (save>0) {
    	   rem = save%10;
    	   rev = rev*10+rem;
    	   save= save/10;
       }
    	   if (num==rev)
    	   {
    		   System.out.println(num+"num is palindrome");
    	   }
    	   else  {
    		   System.out.println(num+"num is not palindrome");
    	   }
	}
}

