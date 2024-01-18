package variable;

public class Local {

	public void login()
	{
		int i=10;  //local var....
		System.out.println(i);  
	}
            
	     
	public static void main(String[] args) {
		
        Local obj=new Local();   //object
		
		obj.login();  // object reference
		
		int x=20;  // local var....
		
		System.out.println(x);

		 int w = 12;
	     System.out.println(w);
	double h = 12d;
	System.out.println(h);
	char u = 'l';
	System.out.println(u);
	 long f = 2343432535532l ;
	System.out.println(f);
	}

}


