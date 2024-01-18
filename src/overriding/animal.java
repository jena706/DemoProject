package overriding;

public class animal extends Sholay{
        public void gabar() {
        	System.out.println("kitne admin the");
        }
        public void basanti() {
        	System.out.println("main nachungi");
        }
	public static void main(String[] args) {
    animal obj=new animal();
   obj.thakur();
   obj.gabar();
   obj.basanti();
	}
	

}
