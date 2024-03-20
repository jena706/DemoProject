package practiceQAcode;

public class FinfMissingNum {

	public static void main(String[] args) {
        int sum1=0;
        int a[]= {2,3,4,5,7,1};
        for (int i =0;i <a.length; i++) {
        	sum1=sum1+a[i];
        	
        }
        System.out.println("Rang of sum1="+sum1);
        int sum2=0;
        for (int j =1; j<=7; j++) {
        	sum2=sum2+j;
        }
        System.out.println("sum of sum2="+sum2);
        System.out.println("Missing NUM="+ (sum2-sum1));
	}

}
