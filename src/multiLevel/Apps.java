package multiLevel;

public class Apps extends Hardware{ //CHILD CLASS2
public void rom() {
	System.out.println("STORAGE");
}
	public static void main(String[] args) {
		Apps obj= new Apps();
		obj.rom();
		obj.Ram();
		obj.salesForce();
	}

}
