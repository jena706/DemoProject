package elementJava;

public class Largest {

	public static void main(String[] args) {
    int [] array = {28,90,46,22,44,12}; 
  //initialize an array  named array and integer values
		int smallest = array[0]; 
		//initialize the variable smallest with the first element of array
		int largest = array[0];
		//initialize the variable largest with the first element of array
		for (int i=1; i<array.length;i++) {
		//initiate loop	
			if(array[i]<smallest) {
				smallest=array[i];
			}else if (array[i]>largest) {
				largest=array[i];
			}
	    }
		System.out.println("smallest element:" + smallest);
		System.out.println("largest element:" + largest);
	}
}
