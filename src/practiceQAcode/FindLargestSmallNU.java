package practiceQAcode;

public class FindLargestSmallNU {

	public static void main(String[] args) {
           int[]array= {7,34,65,98};
           int smallest =array[0];
           int largest=array[0];
           for(int i=0;i<array.length; i ++) {
        	 if(array[i]<smallest) {
        		 smallest=array[i];
        	 }
        	 else if(array[i]>largest) {
        		 largest=array[i];
        	 }
           }
           System.out.println("Largest num="+largest);
           System.out.println("Small num="+smallest);
	}

}
