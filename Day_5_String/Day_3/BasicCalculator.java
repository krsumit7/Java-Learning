import java.util.Scanner;
public class BasicCalculator{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("enter operator (+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        double result;
        if (operator == '+'){
            result =num1+num2;
            System.out.println("result: " +result);

        }else if (operator == '-'){
            result =num1-num2;
            System.out.println("result: " + result);


        }else if (operator == '*'){
            result =num1*num2;
            System.out.println("result: " + result);
        }else if (operator == '/'){
            if(num2 !=0) {
                result = num1/num2;
                System.out.println("result: " + result);

            }else{
                System.out.println("error: division by zero is not allowed");

            }
        }else if (operator =='%'){
            result =num1 % num2;
            System.out.println("result: " + result);

        }else {
            System.out.println("invalid operator.");

        }
        sc.close();
    }
}