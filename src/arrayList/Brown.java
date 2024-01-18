package arrayList;
import java.util.*;
public class Brown {

	public static void main(String[] args) {
     ArrayList<String>red=new ArrayList<String>();
     red.add("fire");  //index value 0
     red.add("house"); //index value 1
     red.add("bed");   //index value 2
     red.add("water");  //index value 3
     red.add("flower");  //index value 4
     red.add("FRUIT");   //index value 5
     
     System.out.println(red);
     System.out.println(red.size()); //number of elements in list
     System.out.println(red.get(4));  //getting the index value
   //  red.clear(); //clear the value
        System.out.println(red.contains("bed"));  //check the value is exist in list
      red.set(3,"mountain"); //replace the value
      System.out.println(red);
      for (int i=0;i<red.size();i++) {
    	 
    	  System.out.println(red.get(i));  //print that value in for loop
    	  System.out.println('\n'); //taking the space
    	  for(String Green:red) {
    		  System.out.println(Green);
    	  }
    	  
    	  
      }
	}

}
