package pack;

public class Student {
	int rollno,mark1,mark2,mark3;
	String name;
	static String college="NIET";
		public Student(int rlno,String nme,int m1,int m2,int m3) {
			rollno=rlno;
			name=nme;
			mark1=m1;
			mark2=m2;
			mark3=m3;
			}
		public int findTotalMarks() {
			int totalmark=mark1+mark2+mark3;
			return totalmark;
		}
		public void findGrade(int t) {
			if(t>100&&t<150) {
				System.out.println("Grade C");
			}
			else if(t>50&&t<=100) {
				System.out.println("Grade B");
			}
			else {
				System.out.println("Grade A");
			}
		}

	public static void main(String[] args) {
	Student obj=new Student(33,"Nysha",100,50,50);	
	int t=obj.findTotalMarks();
	System.out.println("Rollno:"+obj.rollno);
	System.out.println("Name:"+obj.name);
	System.out.println("Mark1:"+obj.mark1);
	System.out.println("Mark2:"+obj.mark2);
	System.out.println("Mark3:"+obj.mark3);
	System.out.println(college);
	
	
	
	}

}
