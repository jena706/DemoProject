package practiceQAcode;

public class PrimeNum {
	public static void main (String args []) {
		  int num =3;
		  int temp=0;
		  for ( int i =2; i<=num-1; i++) {
			  if (num%i==0) {
			  temp=temp+1;
			  }
		  }
		  if (temp==0) {
			  System.out.println("num is prime="+num);
			 
		  }else {
			  System.out.println("num is not prime ="+num);
		  }
	}

}
