import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kg");
		int kg = scanner.nextInt();
		
		System.out.println("m");
		double m = scanner.nextDouble();
		
		double bmi = kg / (m * m);
		System.out.println("bmi" + bmi);

	}
}
