package Basic_java_Problem_automation_solution;

public class array_min_max {

	public static void main(String[] args) {
		int[] array= {10,5,8,7,9,6};
		int min=0;
		int max;
		
		for(int i=0;i<array.length;i++) {
			min=array[0];
			if(array[0]>array[i]) {
				array[0]=array[i];
			}
		}
		
		System.out.print(min);

	}

}
