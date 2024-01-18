package elementJava;

public class Show {

	public static void main(String[] args) {
    int [] arr = {87,65,21,12,43};
    int min = arr[0];
    int max = arr[0];
    for (int i=1; i<arr.length; i++) {
    	if (arr[i]<min) {
    		min=arr[i];
    	}else if (arr[i]>max) {
    		max=arr[i];
    	}
    }
    System.out.println("min element value:" + min);
    System.out.println("max element value:" + max);
	}

}
