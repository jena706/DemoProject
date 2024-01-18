package elementJava;

public class Break {

	public static void main(String[] args) {
        int [] m= {874,854,765,232,123};
        int low = m[0];
        int big = m[0];
        for (int i=0; i<m.length; i++) {
        	if (m[i]<low) {
        		low=m[i];
        	}else if (m[i]>big) {
        		big=m[i];
        	}
        		
        	
         }
        System.out.println("low element  :" + low);
        System.out.println("big element  :" + big);
	}

}
