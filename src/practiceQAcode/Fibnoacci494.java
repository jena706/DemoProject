package practiceQAcode;

public class Fibnoacci494 {

	public static void main(String[] args) {
           int a = 5;
           int firstnu=0;
           int secnu=1;
           int next;
           for (int i=0; i <a; i++) {
        	   System.out.println(firstnu);
        	   next=firstnu+secnu;
        	  firstnu=secnu;
        	  secnu=next;
        	 
           }
	}

}
