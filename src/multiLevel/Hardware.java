package multiLevel;

public class Hardware extends Software{ //CHILD CLASS1
    public void Ram () {
    	System.out.println("Memory");
    }
	public static void main(String[] args) {
      Hardware obj = new Hardware();
      obj.Ram();
      obj.salesForce(); // ACQURING THE PROPERTIES FROM PARENT
	}

}
