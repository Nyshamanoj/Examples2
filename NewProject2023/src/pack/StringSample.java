package pack;

public class StringSample {

	public static void main(String[] args) {
		String s="Hello World";
		String s1="Hello World";
		System.out.println(s==s1);
		
		String s2=new String("Hello World");
		String s3=new String("Hello World");
		System.out.println(s2==s3);
		
		//replace
		String s4="Hello World";
		s4.replace("H", "m");
		System.out.println(s4);
		
		//to change reference
		String s5="Hello World";
		String s6=s5.replace("H", "m");
		System.out.println(s6);
		
		//StringBuffer
		StringBuffer sb=new StringBuffer("Hello World");
		sb.reverse();
		System.out.println(sb);
		
		//StringBuilder
		StringBuilder sb1=new StringBuilder("Hello World");
		sb1.reverse();
		System.out.println(sb1);




	}

}
