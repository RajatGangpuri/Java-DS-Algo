
// Activity start and end time given. how many maximum activity a person can perform working on a single activity at a time

public class GreedyMaximumActivity{
    public static int check(int[] start,int[] end){
        int count=1;
        int lastend=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastend){
                count++;
                lastend=end[i];
            }
        }
        return count;
        
    }
    public static void main(String[] args){
        int[] start={1,3,0,5,8,5};
        int[] end=  {2,4,6,7,9,9};
        System.out.print(check(start,end));
    }
}