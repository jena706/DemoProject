package practiceQAcode;

public class Fibnoacci1 {

	public static void main(String[] args) {
             int num =7;
             int firstnu=0;
             int sec=1;
             int nextnu;
             for (int i=0; i<num; i++) {
            	 System.out.println(firstnu);
            	 nextnu=firstnu+sec;
            	 firstnu=sec;
            	 sec=nextnu;
             }
	}

}
