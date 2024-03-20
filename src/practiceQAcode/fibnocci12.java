package practiceQAcode;

public class fibnocci12 {

	public static void main(String[] args) {
         int A=9;
         int firstno =0;
         int b=1;
         int nextno;
         for (int i=0; i<A; i++) {
        	 System.out.println(firstno);
        	 nextno=firstno+b;
        	 firstno=b;
        	 b=nextno;
        	 
         }
         
         
	}

}
