package practiceQAcode;

import java.util.HashSet;

public class RemoveDupEleFromSortARRAY {

	public static void main(String[] args) {
		     int [] a= {1,2,4,5,6,9,2,3,1,6,9,6};
             HashSet<Integer> dup= new HashSet<Integer>();
             for (int i=0; i<a.length; i++) {
            	  dup.add(a[i]);
             }
             System.out.println(dup);
	}

}
