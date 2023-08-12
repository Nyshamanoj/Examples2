package pack;

public class SampleStringClass {

	public static void main(String[] args) {
		String s="Hello World";
		String s1="Hello world";
		String s2="Java";
		String s3="World";
		//length of the given string
		int length=s.length();
		System.out.println("Length of the given string is:"+length);
		
		//character at the specified string
		char string_char=s.charAt(4);
		System.out.println("Character at the index is:"+string_char);
		
		//concatenation
		String conct_string=s1.concat(s2);
		System.out.println("Concatenated String is:"+conct_string);
		
		//equal and equal ignorance case
		boolean b=s.equals(s1);
		System.out.println(b);
		
		boolean b1=s.equalsIgnoreCase(s1);
		System.out.println(b1);
		
		//upper case
		String uppercase=s.toUpperCase();
		System.out.println(uppercase);
		
		//lower case
		String lowercase=s.toLowerCase();
		System.out.println(lowercase);
		
		//replace
		String replaced_string=s.replace("H", "m");
		System.out.println(replaced_string);
		
	}

}
