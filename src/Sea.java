
public class Sea {

	public static void main(String[] args) {
       int [] num = {56,78,21,89};
       int small=num[0];
       int large= num[0];
       for(int i=0; i<num.length; i++) {
    	 if (num[i]<small) {
    		 small=num[i];
    	 }else if(num[i]>large) {
    		 large=num[i];
    	 }
       }
      System.out.println("small element:"+ small);
      System.out.println("large element:"+ large);
	}

}
