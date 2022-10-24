package Basic_java_Problem_automation_solution;

public class sumOFArray {

	public static void main(String[] args) {
		int[] array= {10,5,8,7,9,6};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.print(sum);
	}

}
