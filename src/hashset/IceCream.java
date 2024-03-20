
package hashset;
import java.util.HashSet;;
public class IceCream {


	public static void main(String[] args) {
 HashSet<Integer>m1=new HashSet<Integer>( );
 m1.add(30);
 m1.add(20);
 m1.add(40);
 m1.add(70);
 m1.add(70);
 
System.out.println(m1);
System.out.println(m1.containsAll(m1));
System.out.println(m1.clone());

	}


}
