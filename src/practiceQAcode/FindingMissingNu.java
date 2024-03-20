package practiceQAcode;

public class FindingMissingNu {

	public static void main(String[] args) {
		    int sum1=0;
            int [] a= {1,2,3,4,6,7,8,9};
            for (int i=0; i<a.length; i++) {
            	sum1=sum1+a[i];
            }
            System.out.println("sum of element="+sum1);
            int sum2=0;
            for(int i=1; i<=9; i++) {
            	sum2=sum2+i;
            }
            System.out.println("sum of range element="+sum2);
            System.out.println("missing num is"+ (sum1-sum2));
          
        }
	
	}


