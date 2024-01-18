package methodOverloading;

public class LOKI {
      public void W() {
    	  System.out.println("NO value");
      }
      public void W(int x) {
    	  System.out.println("int datatype");
    	  
      }
      public void W(String s) { 
    	  System.out.println("String value");
    	  
      }
      
	public static void main(String[] args) {
             LOKI obj =new LOKI();
             obj.W();
             obj.W(78);
             obj.W("KALIA");
             obj.W('A');
             
	}

}
