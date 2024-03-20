package practiceQAcode;

public class DuplicateArray3 {

	public static void main(String[] args) {
          int a []= {1,2,1,3,1,2,3,4,8,0,43};
           for 
              ( int i=0; i<a.length; i++) {
        	   for (int j =i+1; j<a.length; j++) {
        		  if( a[i]==a[j])
        			  System.out.println("Duplicate value="+ a[j]);
        	   }
           }
     
	}

}
