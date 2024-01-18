package variable;

public class Instance {
	int x=23;
	int y=43;
	
	public void you() {
		System.out.println(y);
	}
		
	public void we() {
		 System.out.println(x);
	}
	public static void main(String[] args) {
		Instance obj = new Instance  ();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.we();
       obj.you();
	}

}
