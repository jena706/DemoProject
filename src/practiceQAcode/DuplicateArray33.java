package practiceQAcode;

public class DuplicateArray33 {

	public static void main(String[] args) {
                 int a []= {8,3,2,1,3,4,8};
                 for (int i=0; i <a.length; i++) {
                	 for (int j =i+1; j <a.length; j++) {
                		 if( a[i]== a[j]) {
                			 System.out.println("Dup"+a[j]);
                		 }
                		
                		}
                	 
                	 }
                
                 }
               

}
