package practiceQAcode;

public class FindLargestNumSmallestNum {

	public static void main(String[] args) {
	   int []arr= {12,32,1};
	   int largest=arr[0];
	    int smallest=arr[0];
	    for (int i=0; i<arr.length; i++) {
	    	if (arr[i]<smallest) {
	    		smallest=arr[i];
	    	}
	    	else if (arr[i]>largest) {
	    		largest=arr[i];    	
	    		}
	    }
	    System.out.println("smallest="+smallest+"and"+"largest="+largest);
  }
}