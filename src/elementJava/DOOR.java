package elementJava;

public class DOOR {

	public static void main(String[] args) {
      int  red [] = {32,54,98,62};
      int lowest = red[0];
      int highest= red[0];
      for(int i=0; i<red.length; i++) {
    	  if (red[i]<lowest) {
    		  lowest= red[i];
    	  }else if(red[i]>highest) {
    		  highest=red[i];
    	  }
      }    
	 System.out.println("lowest elemenet is :" + lowest);
	 System.out.println("highest element is :" + highest);
	}

}
