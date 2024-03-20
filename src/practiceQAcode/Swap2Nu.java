package practiceQAcode;

public class Swap2Nu {

	public static void main(String[] args) {
        int a=10;
        int b=30;
//        System.out.println("Before Swap="+a+","+b);
//        int t=a; //Logic 1 with third value approch
//        a=b;
//        b=t;
//        System.out.println("After Swap ="+a+ ","+b);
     //   2nd  Approch without third variable
          a =a+b;
          b=a-b;
          a=a-b;
          System.out.println("After Swap ="+a+ ","+b);
//        3Rd Approch with *&/
//         a=a*b;//300
//         b=a/b;//10
//         a=a/b;//30
         System.out.println("After Swap ="+a+ ","+b);
	}

}
