package staticVar;

public class Lion {
	static int J=67;
	public static void main(String[] args) {
        Lion obj=new Lion();
		System.out.println(obj.J);  //OBJ REF CALL
		System.out.println(J);      //DIRECT CALL
		System.out.println(Lion.J); // CLASS REF CALL
	}

}
