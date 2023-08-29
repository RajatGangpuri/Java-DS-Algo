
// Power using recurssion
public class RecurssionPower1{
    
    public static int power(int x, int n){
        if(x==0){
            return 1;
        }
        int ans=n*power(x-1,n);
        return ans;
    }
    

    public static void main(String[] args){
        int x=10;
        int n=2;
        System.out.println(power(x,n));
    }
}