package pack;

public class SmallestElementInAnArray {

	public static void main(String[] args) {
		int arr_a[]= {10,3,11,56,2};
		int smallest=arr_a[0];
		for(int i=1;i<arr_a.length;i++) {
			if(smallest>arr_a[i]) {
				smallest=arr_a[i];
			}
		}
		System.out.println(smallest);

	}

}
