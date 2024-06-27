import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        char operator;


        try {
            System.out.println("Java Calculator Task");

            System.out.print("Enter The Number1: ");
            number1 = scanner.nextDouble();

            System.out.print("Enter The Number2: ");
            number2 = scanner.nextDouble();


            System.out.println("Allowed Operators: ");
            System.out.println("Addition  +");
            System.out.println("Subtraction  -");
            System.out.println("Multiplication  *");
            System.out.println("Division  /");
          
            System.out.println("Choose an operation: (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            double answer;
            switch(operator){
                case '+' -> answer = add(number1, number2);
            
                case '-' -> answer = subtract(number1, number2);
                
                case '*' -> answer = multiply(number1, number2);
                
                case '/' -> answer = divide(number1, number2);
                
                default -> {
                    System.out.println("Error! Invalid Operation");
                    return;
                }


            }

            System.out.println("Answer is: " + answer);


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }

    public static double add(double number1, double number2){

        return number1 + number2;
    }

    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    public static double divide(double number1, double number2){
        if (number2 == 0) {
            throw new ArithmeticException("Division By Zero is not Allowed");
        }

        return number1 / number2;
    }

}