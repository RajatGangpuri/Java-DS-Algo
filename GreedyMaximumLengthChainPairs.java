
// Max length chain of pairs

import java.util.*;
public class GreedyMaximumLengthChainPairs{
    public static void check(int[][] Q){
        int count=1;
        int[][] ans=new int[Q.length][3];
        for(int i=0;i<Q.length;i++){
            ans[i][0]=i;
            ans[i][1]=Q[i][0];
            ans[i][2]=Q[i][1];
        }
        int lastEnd=ans[0][2];
        Arrays.sort(ans,Comparator.comparingInt(o->o[2]));

        for(int i=0;i<Q.length;i++){
            if(ans[i][1]>lastEnd){
                count++;
                lastEnd=ans[i][2];
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[][] Q={{5,24},{39,60},{5,28},{27,40},{50,90}};
        check(Q);
    }
}