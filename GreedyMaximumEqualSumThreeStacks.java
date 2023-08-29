
//Find Maximum Equal sum of Three Stacks
//https://practice.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1
public class GreedyMaximumEqualSumThreeStacks{
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0;i<S1.length;i++){
            sum1=sum1+S1[i];
        }
        for(int i=0;i<S2.length;i++){
            sum2=sum2+S2[i];
        }
        for(int i=0;i<S3.length;i++){
            sum3=sum3+S3[i];
            
        }
        int i=0;
        int j=0;
        int k=0;
        while(true){
            if(sum1==0 || sum2==0 || sum3==0){
                return 0;
            }
            if(sum1==sum2 && sum2==sum3){
                break;
            }
            int max=Math.max(sum1,Math.max(sum2,sum3));
            if(max==sum1){
                sum1=sum1-S1[i];
                i++;
            }
            else if(max==sum2){
                sum2=sum2-S2[j];
                j++;
            }
            else{
                sum3=sum3-S3[k];
                k++;
            }
        }
        return sum1;
    }
    public static void main(String[] args){
        int[] S1={4,2,3};
        int[] S2 ={1,1,2,3};
        int[] S3={1,4};
        int N1=2;
        int N2=1;
        int N3=3;
        System.out.print(maxEqualSum(N1,N2,N3,S1,S2,S3));
    }
}