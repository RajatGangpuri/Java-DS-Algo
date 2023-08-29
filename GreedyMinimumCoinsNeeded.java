
// Mimum coins needed to make changes to collect value

import java.util.*;
public class GreedyMinimumCoinsNeeded{
    public static void check(int[] Q){
        int count=0;
        int value=490;
        Arrays.sort(Q);

        for(int i=Q.length-1;i>=0;i--){
            if(value>=Q[i]){
                while(value>=Q[i]){
                    count++;
                    value=value-Q[i];
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[] Q={1,2,5,10,20,50,100,500,1000,2000};
        check(Q);
    }
}