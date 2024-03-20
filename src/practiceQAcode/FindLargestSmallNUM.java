package practiceQAcode;

public class FindLargestSmallNUM {
       public static void main (String args[]) {
    	    int a[]= {12,43,15,78};
    	    int largest=a[0];
    	    int smallest=a[0];
    	    for (int i=0; i<a.length; i++) {
    	    	if (a[i]<smallest) {
    	    		smallest=a[i];
    	    	}
    	    	else if (a[i]>largest) {
    	    		largest=a[i];    	
    	    		}
    	    }
    	    System.out.println("smallest="+smallest+"and"+"largest="+largest);
       }
}
