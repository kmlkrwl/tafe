import java.util.Scanner;

public class BmiTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Bmi myBmi = new Bmi();
		System.out.println("Enter Height: ");
		myBmi.setHeight(input.nextDouble());
		System.out.println("Enter Weight: ");
		myBmi.setWeight(input.nextDouble());
		double bmi = myBmi.getBmi();
		System.out.printf("BMi is %f\n",bmi);
		myBmi.showResults();
	}
}