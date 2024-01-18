package elseIf;

public class Choco {

public static void main(String[] args) {
		
		int mark=66;
		
		if(mark>=75)
		{
			System.out.println("distinction......");
		}
		
		else if(mark>=60 && mark<75)
		{
			System.out.println("first class");
		}
		
		else if(mark>=50 && mark<60)
		{
			System.out.println("second class");
		}
		
		else if(mark>=35 && mark<50)
		{
			System.out.println("pass class");
		}
		
		else
		{
			System.out.println("failed....");
		}
		
	

	}

}