//Recursion means using the same function again and again.
//Fibonacci using recursion
public class RecursionFibonacci{
    public static void fibonacci(int a,int b,int num){
        if(num<=0){
            return;
        }
        int sum=a+b;
        a=b;
        b=sum;
        num--;
        System.out.print(sum+" ");
        fibonacci(a,b,num);
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        int num=3;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibonacci(a,b,num-2);
    }
}
