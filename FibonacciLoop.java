//Fibonacci by using Loop
public class FibonacciLoop{
    public static void main(String[] args){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int num=1;
        for(int i=0;i<num-2;i++){
            int sum=a+b;
            int temp=b;
            b=sum;
            a=temp;
            System.out.print(sum+" ");
        }
    }
}