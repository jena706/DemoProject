package hashset;
import java.util.HashSet;
public class Kaju {

	public static void main(String[] args) {
		HashSet<String> B1= new HashSet<String>();
		B1.add("Take");
		B1.add("Video");
		B1.add("best");
		B1.add("Mango");
		System.out.println(B1);
		B1.addAll(B1);
		System.out.println(B1.addAll(B1));
		System.out.println(B1.contains("best"));
		System.out.println(B1.equals(B1));
		System.out.println(B1.size());
		for(String C1:B1) {
			System.out.println(C1);
		}
	}

}
