package pack;

public class AggregationEmployee {
	int empid;
	String name;
	AggregationAddress address;
	
	public AggregationEmployee(int id,String nme,AggregationAddress addr) {
		empid=id;
		name=nme;
		address=addr;
	}
	public void display() {
		System.out.println(empid+name+address.city+address.state+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationAddress address1=new AggregationAddress("WYN","KERALA","INDIA");
		AggregationEmployee e1=new AggregationEmployee(111,"NYSHA",address1);
		e1.display();
		AggregationAddress address2=new AggregationAddress("WYN","KERALA","INDIA");
		AggregationEmployee e2=new AggregationEmployee(222,"NIMISHA",address2);
		e2.display();

	}

}
