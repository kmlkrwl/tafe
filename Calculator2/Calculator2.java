
import javax.swing.JOptionPane;

public class Calculator2 {
    public static void main( String args[] )
    {
        String firstNumber, secondNumber, operator;  		// string variables for reading user input
        int number1, number2;		 // int variables for the decimal value of the numbers
        float  result = 0;              		// sum of number1 and number2
        char op;                      // operator
        // read in first number from user as a string
        firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
        //read operator
        operator = JOptionPane.showInputDialog("Enter + , - , * , / ");
        // read in second number from user as a string
        secondNumber = JOptionPane.showInputDialog( "Enter second integer");
        // convert numbers from type String to type int
        number1 = Integer.parseInt( firstNumber );
        number2 = Integer.parseInt( secondNumber );
        op = operator.charAt(0);    //get the operater from the string 
        result = calculate(number1,op,number2);
        // display the results
        JOptionPane.showMessageDialog( null, number1 + " " + operator + " " + number2 + " = "+ Float.toString(result), "Results", JOptionPane.PLAIN_MESSAGE );
    }
/**
* num1 - Number1 
*o - operator from either +,-,/ or *
*num2 - number2
*return the result 
*/
    public static float calculate(int num1,char o,int num2) {
        float r = 0;
        switch (o) {
            case '+' :
                r = add(num1,num2);
                break;
            case '-':
                r = subtract(num1,num2);
                break;
            case '*':
                r= multiply(num1,num2);
                break;
            case '/':
                r = divide(num1,num2);
                break;
            default:
                System.out.printf("error!");
                break;
        } 
        return r;
    }
//adds two numbers
    public static int add(int number1,int number2) {
        return number1 + number2;
    }
//subtract two numbers
    public static int subtract(int number1, int number2) {
        return number1-number2;
    }
// multiply two numbers
    public static int multiply(int number1, int number2) {
        return number1/number2;
    }
// divide two numbers
    public static float divide(int number1, int number2) {
        return (float) number1/number2;
    }
// drawLine
    public static void drawLine() {
        System.out.println("___________________________");
    }
}
