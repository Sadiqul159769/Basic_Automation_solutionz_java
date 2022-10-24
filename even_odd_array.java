package Basic_java_Problem_automation_solution;

public class even_odd_array {

	public static void main(String[] args) {
		int[] array= {10,5,8,7,9,6};
		int even=0;
		int odd=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println("This is even Number: "+ array[i]);
				//even=array[i];
				
			}
			else
				System.out.println("This is odd number: "+ array[i]);
		}
		

	}

}
