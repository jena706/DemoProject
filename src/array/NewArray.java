package array;

public class NewArray {

	public static void main(String[] args) {
		

	          String s[]= {"ajay", "kartik", "akshay", "srk", "xyz"};
	          
	          System.out.println(s.length);
	          
	          System.out.println(s[0]);
	          
	          System.out.println(s[3]);
	          
	         // System.out.println(s[5]);
	          
	       
	         
	         s[0]="aaliya";
	         s[1]="bhutiya";
	         //first way
	       
	         //second way
	         for(int i=0; i<s.length; i++)
	         {
	        	 System.out.println(s[i]);
	         }
	         
	         System.out.println();
	         
	         //third way
	         for(String k:s)
	         {
	        	 System.out.println(k);
	         }
	         
		}

	}
