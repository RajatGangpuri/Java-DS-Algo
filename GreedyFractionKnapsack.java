//Fraction Knapsack Greedy algorithm

public class GreedyFractionKnapsack{
    public static double check(int[] value,int[] weight){
        double[] ratio=new double[value.length];
        int capacity=50;
        double val=0;
        for(int i=0;i<value.length;i++){
            ratio[i]=(double)value[i]/weight[i];
        }
        for(int i=0;i<value.length;i++){
            if(capacity>=weight[i]){
                val=val+ratio[i]*weight[i];
                capacity=capacity-weight[i];
            }
            else{
                val=val+(ratio[i]*capacity);
                break;
            }
        }
        return val;
    }
    public static void main(String[] args){
        int[] value={60,100,120};
        int[] weight=  {10,20,30};
        System.out.print(check(value,weight));
    }
}