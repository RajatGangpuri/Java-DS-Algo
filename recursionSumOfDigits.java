//Sum of Digits of a number
//Get n value by doing module and again num by dividing num
public class recursionSumOfDigits {
    public static void factorial(int sum,int num){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum=sum+num%10;
        factorial(sum,num/10);
    }
    public static void main(String[] args){
        int num=21;
        factorial(0,num);
    }
}
