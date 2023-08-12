package pack;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSampleProgram {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//Add elements in an array list
		al.add("Nysha");
		al.add("Aswathy");
		al.add("Merin");
		al.add("Java");
		al.add("Aswin");
		al.add("Geethu");
		System.out.println(al);
		
		//get an element from specific index
		String return_element=al.get(3);
		System.out.println(return_element);
		
		//size of the array list
		int size=al.size();
		System.out.println(size);
		
		//search a specific string
		boolean b=al.contains("Nysha");
		System.out.println(b);
		
		//remove an element from an array list
		al.remove(3);
		System.out.println("Array after printing in 3rd pos"+al);
		
		//iterator
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("Using for-each loop\n");
		for(String a:al) {
			System.out.println(a);
		}
		
	}

}
