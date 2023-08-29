
// Max length chain of pairs

import java.util.*;
public class GreedyMaxLengthChainPairsPair{
    public static void check(int[][] Q){
        int count=1;
        int lastEnd=Q[0][1];
        Arrays.sort(Q,Comparator.comparingInt(o->o[1]));

        for(int i=1;i<Q.length;i++){
            if(Q[i][0]>lastEnd){
                count++;
                lastEnd=Q[i][1];
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[][] Q={{5,24},{39,60},{5,28},{27,40},{50,90}};
        check(Q);
    }
}