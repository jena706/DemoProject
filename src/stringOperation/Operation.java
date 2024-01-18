package stringOperation;

public class Operation {

public static void main(String[] args) {
		
		String name="varun dhawan";
		
		String name1="VARUN DHAWAN";
		
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.charAt(5));
		
		try
		{
		System.out.println(name.charAt(12));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("maximum index value is 11...do not use 12");
			System.out.println(name.charAt(11));
		}
		
		System.out.println(name.concat(" mumbaikar..."));
		
		System.out.println(name.equals(name1));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name.substring(3));
		
		//substring overloading
		
		System.out.println(name.substring(3, 9));
		
		System.out.println(name.startsWith("var"));
		
		System.out.println(name.endsWith("an"));
		
		System.out.println(name.trim());
		
		System.out.println(name.replace('v', 'k'));
		
		System.out.println(name.replace('n', 't'));
		
		System.out.println(name.indexOf('n'));
		
		
	}

}