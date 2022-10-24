package Basic_java_Problem_automation_solution;

public class Arrat_target {

	public static void main(String[] args) {
		int target=9;
		int[] array= {1,5,7,9,9};
		int arrrayOfIndex=0;
		int notMatchNumber=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				arrrayOfIndex=i;
				//System.out.print(i);
				//break;
				System.out.println(arrrayOfIndex);
			}
			else {
				notMatchNumber=target;
			}
		}
		//System.out.println(notMatchNumber);
		
		
	}

}
