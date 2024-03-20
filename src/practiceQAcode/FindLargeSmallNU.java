package practiceQAcode;

public class FindLargeSmallNU {

	public static void main(String[] args) {
          int a []= {12,3,13,93};
          int largest=a[0];
          int smallest=a[0];
          for(int i=0; i<a.length; i++) {
        	  if (a[i]<smallest) {
        		  smallest=a[i];
        	  }
        	  else if (a[i]>largest) {
        		  largest=a[i];
        	  }
          }
          System.out.println(largest);
          System.out.println(smallest);
	}

}
