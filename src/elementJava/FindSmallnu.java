package elementJava;

public class FindSmallnu {

	public static void main(String[] args) {
       int small []= {6,8,9,37};
       int a=small[0];
     for ( int i=0; i>small.length;i++) {
    	 if (small[i]<a) {
    		 a=small[i];
    	 }
    	 else if (small[i]>a) {
    		 System.out.println("its not small");
    	 }
    	 
    	 }
     System.out.println("small no="+a);
     
    	}


}
