package Basic_java_Problem_automation_solution;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String args[]) {
	int a=0;
	int b=1;
	int c;
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	//System.out.print(a);
	for(int i=1;i<=n;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
	}
	
}
