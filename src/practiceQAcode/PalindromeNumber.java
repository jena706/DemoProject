package practiceQAcode;

public class PalindromeNumber {

	public static void main(String[] args) {
               int num=787;
               int save=num;
               int rev=0; 
               int rem ;
               while (save>0) {
            	   rem=save%10;
            	   rev=rev*10+rem;
            	   save=save/10;
               }
               if (num==rev) {
            	   System.out.println("number is palindrome"+num);
               }
               else { System.out.println("number is not palindrome"+num);
            	   
               }
	}

}
