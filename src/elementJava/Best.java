package elementJava;

public class Best {

	public static void main(String[] args) {
           int blue []= {43,76,32,65};
           int lower=blue[0];
           int higher=blue[0];
           for (int i=0; i<blue.length; i++) {
        	   if (blue[i]<lower) {
        		   lower=blue[i];
        	   }else if (blue[i]>higher) {
        		   higher=blue[i];
        	   }
           }
           System.out.println("lower element:" + lower);
           System.out.println("higher element:"+ higher);
	}

}
