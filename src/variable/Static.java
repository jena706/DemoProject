package variable;

public class Static {
   static int k =53;     
	static int x=34;
   static int h=312;
         public static void main(String[] args) {
		System.out.println(x);
	   Static obj=new Static();
	System.out.println(obj.x);
	System.out.println(Static.x);
	System.out.println(h);
	System.out.println(k);
        
         }

}
