//////constructor overloading////////////////////is conoverriding possible no///////

package consOverLoading;

public class CoOverloading {
    public CoOverloading() {
    	System.out.println("no argu");
    }
    public CoOverloading(char c) {
    	System.out.println(" char argumenst");
    }
    public CoOverloading(int i, float f) {
    	System.out.println("int i, float f arguments pass");
    }
    
	public static void main(String[] args) {
		CoOverloading obj = new CoOverloading();
		CoOverloading obj2 = new CoOverloading('p');
		CoOverloading obj3= new CoOverloading (18,12.2f);
	}

}
