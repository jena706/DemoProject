package practiceQAcode;

public class OverLoading {
	void main() {
		System.out.println("null");
	}
	void main(int x) {
		System.out.println("integer value");
	}
	void main(char c) {
		System.out.println("char value");
	}
   void main(String s) {
	   System.out.println("string value");
   }
   void main(double d) {
	   System.out.println("double value");
   }
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.main();
		obj.main(979);
		obj.main("string");
		obj.main('a');
		obj.main(12.2);
		

	}

}
