package Basic_java_Problem_automation_solution;

public class Starloop_1O_problem {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			if(i%2==0) {
			for(int j=1;j<=i;j++) {
				if(j%2==0)
				System.out.print("1");
				else
					System.out.print("0");
			}
		}
			else {
				for(int j=1;j<=i;j++) {
					if(j%2==0)
					System.out.print("0");
					else
						System.out.print("1");
				}
			}
			System.out.println();	
		}
	}
}
