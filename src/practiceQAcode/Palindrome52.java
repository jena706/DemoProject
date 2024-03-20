package practiceQAcode;

public class Palindrome52 {

	public static void main(String[] args) {
       int num =1221;
       int save= num;
       int rev=0,rem;
       while(save>0) {
    	    rem = save%10;
    	    rev=rev*10+rem;
    	    save=save/10;
       }
       if (num==rev) {
    	   System.out.println("num is palindrom");
       }
       else {
    	   System.out.println("Num is not palindrome");
       }
	}

}
