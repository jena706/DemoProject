package arrayList;
import java.util.*;
public class Strawberry {

	public static void main(String[] args) {
  ArrayList<Character>mango=new ArrayList<Character>();
       mango.add('h');
       mango.add('j');
       mango.add('u');
       mango.add('i');
       mango.add('j');
       mango.add(3, 'p');
       mango.set(0, 'r');
    //   mango.clear();
       System.out.println(mango.size());
       System.out.println(mango);
       for(int i=0; i<mango.size(); i++) {
    	   System.out.println(mango.get(i));
    	  
       }
       System.out.println('\n');
       for (Character apple:mango) {
       System.out.println(apple);
       }
       
	}

}
