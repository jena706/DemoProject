package practiceQAcode;

public class PrimeNum32 {

	public static void main(String[] args) {
       int prime =17;
       int temp=0;
       for (int i=2; i<prime-1; i++) {
    	   if (prime%i==0) {
    		   temp=temp+1;
    	   }
    	  
       }
       if (temp>0) {
    	   System.out.println("num is not prime"+prime);
       }
       else {
    	   System.out.println(prime+"num is  prime");
       }
       
	}

}
