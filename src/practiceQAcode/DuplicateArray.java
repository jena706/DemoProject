package practiceQAcode;

public class DuplicateArray {

	public static void main(String[] args) {
       int [] array= {1,2,1,3,4,3,5,6};
       for(int i=0; i<array.length; i++) {
    	   for(int j=i+1; j<array.length; j++) {
    		  if( array[i]==array[j]) {
    		  System.out.println("Duplicate element="+ array[i]);
    		  }
    	   }
       }
	}

}
