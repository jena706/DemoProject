package practiceQAcode;

public class Fibnoacci221 {

	public static void main(String[] args) {
         int a=10;
         int firstNu=0;
         int nextNu;
         int secNu=1;
         for (int i=0; i<a; i++) {
        	 System.out.println(firstNu);
        	 nextNu=firstNu+secNu;
        	firstNu=secNu;
        	 secNu=nextNu;
         }
	}

}
