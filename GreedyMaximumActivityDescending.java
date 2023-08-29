
// Activity start and end time given. how many maximum activity a person can perform working on a single activity at a time
// Descending Order

import java.util.*;
public class GreedyMaximumActivityDescending{
    public static void check(int[] start,int[] end){
        
        int count=1;
        ArrayList<Integer> array=new ArrayList<>();
        
        int[][] td=new int[end.length][3];
        for(int i=0;i<end.length;i++){
            td[i][0]=i;
            td[i][1]=start[i];
            td[i][2]=end[i];
        }
        Arrays.sort(td,Comparator.comparingDouble(o -> o[2]));
        array.add(td[0][0]);
        int lastEnd=td[0][2];
        for(int i=1;i<start.length;i++){
            if(td[i][1]>=lastEnd){
                count++;
                lastEnd=td[i][2];
                array.add(td[i][0]);
            }
        }
        System.out.println(count);
        System.out.println(array);
    }
    public static void main(String[] args){
        int[] start={7,6, 2, 7, 3};
        int[] end=  {10,6 ,10 ,9 ,5};
        check(start,end);
    }
}