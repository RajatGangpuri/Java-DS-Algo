//Fibonacci using recursion
public class Fibonacci{
    public static void recursion(int a,int b,int num){
        if(num<=0){
            return;
        }
        int sum=a+b;
        int temp=b;
        b=sum;
        a=temp;
        System.out.print(sum+" ");
        recursion(a,b,num-1);
    }
    public static void main(String [] args){
        int num=5;
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        recursion(a,b,num-2);
    }
}