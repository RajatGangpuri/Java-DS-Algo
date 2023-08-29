//import java.util.*;
public class GCD {
    public static void main(String[] args){
        //Scanner sc =new Scanner(System.in);
        int a= 5;
        int b= 4;
        int LCM=1;
        if(a>b){
            for(int i=2;i<a;i++){
                if(a%i==0 && b%i==0){
                    LCM=i;
                }
            }
        }
        else{
            for(int i=2;i<b;i++){
                if(a%i==0 && b%i==0){
                    LCM=i;
                }
            }
        }
        System.out.print("GCD= "+(a*b)/(LCM));
    }
}
