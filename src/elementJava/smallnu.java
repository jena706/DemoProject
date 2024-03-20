package elementJava;

public class smallnu {

	public static void main(String[] args) {
		  int small []= {69,8,9,37};
	       int a=small[0];
	     for ( int i=0; i>small.length-1;i--) {
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


