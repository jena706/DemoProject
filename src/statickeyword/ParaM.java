package statickeyword;

public class ParaM {
 
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void m1(int x , int y) {
		System.out.println( x * y);
	}
	public void dou (double d)
	{
		System.out.println( d*  d);
	}
	public static void main(String[] args) {
	
 ParaM obj = new ParaM ();
 obj.add(12, 32);
obj.m1(7667776, 556556454);	
	obj.dou(12);
	}

}
