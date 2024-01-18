
public class FirstJavaClass {
public void the () {
	System.out.println("no value");
}
public void the (int x) {
	System.out.println("int value");
	
}
public void the (String s) {
	System.out.println("this is a string value");
}
public void the (char a) {
	System.out.println("this is a char value");
}

	public static void main(String[] args) {
	FirstJavaClass obj = new FirstJavaClass();
	obj.the();
	obj.the(12);
	obj.the("name");
	obj.the('f');
	}
}
	