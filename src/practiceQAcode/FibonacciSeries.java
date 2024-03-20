package practiceQAcode;

public class FibonacciSeries {

	public static void main(String[] args) {
         int n =6;
         int firstno=0;
         int secno=1;
         int nextno;
         for(int i=1; i<=n; i++) {
             System.out.println(firstno);
        	 nextno=firstno+secno;
        	 firstno=secno;
        	 secno=nextno;
        	 
        
        
         }
    
	}

}
//0,1,1,2,3,5,8,13,21,34