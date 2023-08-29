//Factorial
import java.util.Scanner;
public class RecursionFactorial {
    public static void factorial(int temp,int num){
        if(num<=1){
            System.out.println(temp);
            return;
        }
        temp=temp*num;
        factorial(temp,num-1);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        factorial(1,num);
        sc.close();
    }
}
