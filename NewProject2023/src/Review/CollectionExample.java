package Review;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("Nysha");
		al.add("Aswathy");
		al.add("Merin");
		al.add("Geethu");
		System.out.println(al);
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		
		
		
		

	}

}
