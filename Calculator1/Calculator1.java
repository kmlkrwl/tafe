
// An addition program 

import java.util.Scanner;  // program uses class Scanner

public class Calculator1 {
   public static void main( String args[] )
   {
       Scanner input = new Scanner(System.in);
       char op;
       double number1;		          // first number to add
       double number2;		         // second number to add
       double result=0;
       
	//prompt the user to input the first number
      	System.out.print("Enter first number: ");
	// read in first number from user as a string
      
      	number1 = input.nextDouble( );
    //ask for the operator
       System.out.print("Choose one from +,-,*,/: ");
       op = input.next().charAt(0);
       

	//do the same for the second number
      	System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        result = calculate(number1,op,number2);
    
       drawLine();
       System.out.printf("%.2f %c %.2f = %.2f\n",number1,op,number2,result);
       drawLine();
       
   }
   /**
* num1 - Number1 
*o - operator from either +,-,/ or *
*num2 - number2
*return the result 
*/
    static double calculate(double num1,char o,double num2) {
        double r = 0;
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
    
//add numbers
    static double add(double number1,double number2) {
        return number1 + number2;
    }

//subract numbers
    static double subtract(double number1, double number2) {
        return number1-number2;
    }

//multiply
    static double multiply(double number1, double number2) {
        return number1*number2;
    }

//divide
    static double divide(double number1, double number2) {
        return number1/number2;
    }

//draw a line
    static void drawLine() {
        System.out.println("___________________________");
    }
}

