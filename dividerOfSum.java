package Basic_java_Problem_automation_solution;

import java.util.Scanner;

public class dividerOfSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		//int value=0;
		//int store=0;
		int result=0;
		
		while(temp>0) {
			result=temp%10+result;
			temp=temp/10;
			
		}
		System.out.println(result);
	}

}
