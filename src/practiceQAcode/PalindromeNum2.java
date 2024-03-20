package practiceQAcode;

public class PalindromeNum2 {

	public static void main(String[] args) {

		
			int Number = 6776;
			int ReverseNumber = 0;
			int Remainder ;
			
			
			// store the number to  OriginalNumber
			int OriginalNumber = Number;
			
			while(Number >0) {
				Remainder = Number % 10 ;
				ReverseNumber = ReverseNumber * 10 + Remainder;
				Number = Number /10;
					
			}
			if(OriginalNumber == ReverseNumber) {
				System.out.println(OriginalNumber+" is a Palindrome...");
			}
			else {
				System.out.println(OriginalNumber+ " is not Palindome...");
			}
			
		}

	}
	


