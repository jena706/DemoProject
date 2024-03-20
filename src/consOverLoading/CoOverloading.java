//////constructor overloading////////////////////is conoverriding possible no///////

package consOverLoading;

public class CoOverloading {
     CoOverloading() {
    	System.out.println("no argu");
    }
  CoOverloading(char c) {
    	System.out.println(" char argumenst");
    }
  CoOverloading(int i, float f) {
    	System.out.println("int i, float f arguments pass");
    }
  void over (int a,int b) {
             System.out.println(a+b);
  }
    
	public static void main(String[] args) {
		CoOverloading obj = new CoOverloading();
		CoOverloading obj2 = new CoOverloading('p');
		CoOverloading obj3= new CoOverloading (18,12.2f);
		CoOverloading obj4= new CoOverloading();
		obj.over(100, 0);
	}

}
