
public class Bmi {
	
	private double weight;
	private double height;

	public Bmi() {
		
	}
	public Bmi(double weight,double height) {
		this.weight = weight;
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double w) {
		this.weight = w;
	}

	public double getBmi() {
		return weight/(height*height);
	}
	
	public void showResults() {
		double mBmi = getBmi();
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

//constants
	private final static double OB_III= 40;

    private final static double OB_II_LO = 35;

    private final static double OB_I_LO = 30;

    private final static double OVER_W8_LO = 25;

    private final static double NORMAL_W8_LO = 19;

   

}