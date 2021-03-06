import java.util.Scanner;

public class Bmi {
	private final static double OB_III= 40;

    private final static double OB_II_LO = 35;

    private final static double OB_I_LO = 30;

    private final static double OVER_W8_LO = 25;

    private final static double NORMAL_W8_LO = 19;

    private final static String ENTER_WEIGHT = "Enter weight in Kg :";
    private final static String ENTER_HEIGHT = "Enter height in meters :";

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter weight in Kg: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in m: ");
		double height = input.nextDouble();
		double bmi = calculateBmi(weight,height);
		showBmiResult(bmi);

	}

	private static double calculateBmi(double weight, double height) {
        return weight/(height*height);
    }
    /** takes bmi as a parameter
	* shows results as string
    */ 
    
    public static void showBmiResult(double mBmi) {
    
        if (mBmi >= OB_III ) {
            System.out.println("Obesity level III");
        } else if (mBmi>OB_II_LO){
            System.out.println("Obesity level II");
        } else if (mBmi > OB_I_LO) {
            System.out.println("Obesity level I");
        } else if (mBmi > OVER_W8_LO) {
            System.out.println("Overweight");
        } else if (mBmi > NORMAL_W8_LO) {
            System.out.println("Normal");
        } else
            System.out.println("Underweight");
    }

       
   
}
