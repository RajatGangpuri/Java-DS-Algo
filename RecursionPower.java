//Recursion means using the same function again and again.
//Find power of a number using recusion
public class RecursionPower {
    public static void factorial(int temp,int power,int num){
        if(num==0 && power==0){
            System.out.println(0);
            return;
        }
        if(power==0){
            System.out.println(temp);
            return;
        }
        temp=num*temp;
        factorial(temp,power-1,num);
    }
    public static void main(String[] args){
        int num=2;
        int power=0;
        factorial(1,power,num);
    }
}
