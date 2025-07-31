import java.util.Scanner;
public class OneTo_Ten1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=1;
        for(; ;){
            System.out.println(x);
            x++;
            if(x>10) 
            break;
        }
    }
}