//Bubble Sort by using Loop
public class SortBubble {
    public static void main(String args[]){
        int[] array={3,5,2,5,1};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
}
