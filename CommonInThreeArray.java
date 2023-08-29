//CommonInThreeArray
//https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/

import java.util.Arrays;
public class CommonInThreeArray{
    public static void find(int[] array1,int[] array2,int[] array3){
        int max=array1.length+array2.length+array3.length;
        int[] temp=new int[max];
        int index=0;
        for(int i=0;i<array1.length;i++){
            temp[index]=array1[i];
            index++;
        }
        for(int i=0;i<array2.length;i++){
            temp[index]=array2[i];
            index++;
        }
        for(int i=0;i<array3.length;i++){
            temp[index]=array3[i];
            index++;
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length-3;i++){
            if(temp[i]==temp[i+1] && temp[i+1]==temp[i+2]){
                System.out.println(temp[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] array1={1, 2, 3};
        int[] array2={2, 3, 4};
        int[] array3={3, 4, 5};
        find(array1,array2,array3);
    }
}