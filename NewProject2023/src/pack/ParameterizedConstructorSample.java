package pack;

public class ParameterizedConstructorSample {
	int rollno,mark1,mark2,mark3;
	String name;
	public ParameterizedConstructorSample(int r,String n,int m1,int m2,int m3) {
	rollno=r;
	name=n;
	mark1=m1;
	mark2=m2;
	mark3=m3;
	}

	public static void main(String[] args) {
		ParameterizedConstructorSample obj=new ParameterizedConstructorSample(13,"Nysha",31,32,33);
		System.out.println("Rollno:"+obj.rollno);
		System.out.println("Name:"+obj.name);
		System.out.println("Mark1:"+obj.mark1);
		System.out.println("Mark2:"+obj.mark2);
		System.out.println("Mark3:"+obj.mark3);


		

	}

}
