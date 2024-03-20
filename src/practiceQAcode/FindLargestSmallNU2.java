package practiceQAcode;

public class FindLargestSmallNU2 {

	public static void main(String[] args) {
          int[]array= {23,54,90,67};
          int min=array[0];
          int max=array[0];
          for(int i=0; i<array.length; i++) {
        	  if(array[i]<min) {
        		  min=array[i];
        	  }else if(array[i]>max) {
        		  max=array[i];
        	  }
          }
          System.out.println("max value="+max);
          System.out.println("min value="+min);
	}

}
