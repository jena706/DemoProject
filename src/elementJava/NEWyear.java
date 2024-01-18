package elementJava;

public class NEWyear {

	public static void main(String[] args) {
       int [] num= {43,51,21,25,99};
        int small = num[0];
        int big= num[0];
        for (int i=1; i<num.length; i++) {
        	if(num[i]<small){
        		small=num[i];
        	}else if(num[i]>big) {
        		big=num[i];
        	}
        }
        System.out.println("big element is:" + big);
        System.out.println("small element is:"+ small);
	}

}
