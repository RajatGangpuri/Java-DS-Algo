
//count sort
public class SortCount1{

    public static void count(int[] array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        int[] newArray=new int[max+1];

        for(int i=0;i<array.length;i++){
            newArray[array[i]]++;
        }

        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();

        int index=0;
        for(int i=0;i<newArray.length;i++){
            while(newArray[i]>0){
                array[index]=i;
                newArray[i]--;
                index++;
            }
        }


    }
    public static void main(String[] args){
        int[] array={1,3,2,3,4,1,6,4,3};
        count(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}