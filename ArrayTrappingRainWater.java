// trapping rain water
public class ArrayTrappingRainWater{

    public static int find(int[] array){
        int n=array.length;
        int[] leftMax=new int[n];
        leftMax[0]=array[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],array[i]);
        }
        int[] rightMax=new int[n];
        rightMax[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],array[i]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int val=Math.min(leftMax[i],rightMax[i]);
            trappedwater=trappedwater+(val-array[i]);
        }
        return trappedwater;
    }

    public static void main(String[] args){
        int[] array={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(find(array));
    }
}