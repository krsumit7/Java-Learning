import java.util.Scanner;
public class ArithmeticCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: \n ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second number: \n ");
        double num2 = sc.nextDouble();
        System.out.println("Enetr Operators (+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        double result;
        if (operator == '+'){
            result = num1 + num2;
            System.out.println(" result: " + result );

        }else if (operator == '-'){
            result = num1 - num2;
            System.out.println(" result: " + result );

        }else if (operator == '*'){
            result = num1 * num2;
            System.out.println(" result: " + result );

        }else if (operator == '/'){
            if(num2 !=0){
                result = num1 / num2;
                System.out.println("result: " + result);

            }else{
                System.out.println("Error: Division by zero is not allowed");
            }

        }else if (operator == '%'){
            result = num1 % num2;
            System.out.println("result: " + result);

        }else{
            System.out.println("Invalid operators: ");
        }
         sc.close();

    }

}
