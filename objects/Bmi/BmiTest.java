import java.util.Scanner;

public class BmiTest {
	public static void main(String[] args) {

		String ENTER_WEIGHT = "Enter weight in Kg :";
    	String ENTER_HEIGHT = "Enter height in meters :";
		Scanner input = new Scanner(System.in);

		Bmi myBmi = new Bmi();
		System.out.println(ENTER_WEIGHT);
		myBmi.setWeight(input.nextDouble());
		System.out.println(ENTER_HEIGHT);
		myBmi.setHeight(input.nextDouble());
		double bmi = myBmi.getBmi();
		//System.out.printf("Height is:%f,weight is: %f, Bmi is: %f",myBmi.getHeight(),myBmi.getWeight(),bmi);
		myBmi.showResults();
	}
}