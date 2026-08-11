import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // import declaration to use in code later
        Scanner input = new Scanner(System.in);

        while (true) {
        
            System.out.print("\nWrite the first number in the calculation: ");
            double num1 = input.nextDouble();

            System.out.print("\nWrite the second number in the calculation: ");
            double num2 = input.nextDouble();

            input.nextLine(); 

            System.out.print("\nWrite the operation of the calculation: ('add' OR 'sub' OR 'mul' OR 'div' OR 'quit') ");
            String operation = input.nextLine().toLowerCase();

            if (operation.equals("add")){
                double sum = num1 + num2;
                System.out.println(sum);
            }
            else if (operation.equals("sub")){
                double difference = num1 - num2;
                System.out.println(difference);
            }
            else if (operation.equals("mul")){
                double product = num1 * num2;
                System.out.println(product);
            }
            else if (operation.equals("div")){

                if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
                } 

                else {
                double quotient = num1 / num2;
                System.out.println(quotient);
                }
            }
            else if (operation.equals("quit")){
                // closes the input
                input.close(); 
                break;
            }
            else {
                System.out.println("Invalid operation.");
            }
            
        }
        
    }
}
