package pack;

public class StringHomework {

	public static void main(String[] args) {
		String s="Malayalam";
		//reverse this string using StringBuffer
		StringBuffer sb=new StringBuffer("Malayalam");
		sb.reverse();
		System.out.println(sb);
		
		//check whether the reversed string is equal to s
		String s1=sb.reverse().toString();
		s.equals(s1);
		System.out.println(s1);

		
	}

}
