import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int i;
		i = 0;
		System.out.println("kg");
		int kg = scanner.nextInt();
		
		System.out.println("m");
		double m = scanner.nextDouble();
		
		double bmi = kg / (m * m);

		while(i < 2){
		System.out.println("bmi" + bmi);
		i = i + 1;
		}

	}
}
