//Insertion Sort code using loops
//Time complexity= O(n^2)
public class SortInsertion {
    public static void main(String args[]){
        int[] array={89,34,23,9,67};
        for(int i=1;i<array.length;i++){
            int j=i-1;
            int current=array[i];
            while(j>=0 && array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            //placement
            array[j+1]=current;

        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
 