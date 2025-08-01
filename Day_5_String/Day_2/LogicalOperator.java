public class LogicalOperator{
    public static void main(String [] args){
        int a=10;
        int b=20;
        boolean condition1 = (a < b);
        boolean condition2 = (a == 10);
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));
    }
}


