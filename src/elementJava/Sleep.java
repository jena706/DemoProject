package elementJava;

public class Sleep {

	public static void main(String[] args) {
          int [] h = {76,48,89,25};
        int low= h[0];
        int high= h[0];
        for (int i =0; i<h.length; i++) {
        	if (h[i]<low) {
        		low=h[i];
        	}else if(h[i]>high){
        		high=h[i];
        			
        		
        	}
        }
        System.out.println("low element:"+ low);
        System.out.println("high element:"+ high);
	}

}
