package practiceQAcode;

public class MisingNUM {

	public static void main(String[] args) {
         int sum=0;
         int a []= {1,2,4,5};
         for (int i=0; i<a.length; i++) {
        	 sum=sum+a[i];
         }
         System.out.println("sum is="+sum);
         int sum1=0;
         for (int j=1; j<=5; j++) {
        	 sum1=sum1+j;
         }
         System.out.println("sum of sum1="+sum1);
         System.out.println("misssing num"+(sum1-sum));
	}

}
