package practiceQAcode;

public class Palindrome89 {

	public static void main(String[] args) {
        int a= 1221;
         int save=a;
         int rev=0, rem;
         while (save>0) {
        	 rem=save%10;
        	 rev=rev*10+rem;
        	 save=save/10;
        	 
         }
         if(a==rev) {
        	 System.out.println("num is palindrome"+a);
         }
         else {
        	 System.out.println("num isnt palindrome"+a);
         }
	}

}
