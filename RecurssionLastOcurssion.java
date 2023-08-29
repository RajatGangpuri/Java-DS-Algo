
// last ocuurence using recurssion
public class RecurssionLastOcurssion{
    
    public static int lastOccurence(int[] array, int i, int key){
        if(i==array.length){
            return -1;
        }
        int f1=lastOccurence(array,i+1,key);
        if(f1==-1 && array[i]==key){
            return i;
        }
        return f1;
    }
    

    public static void main(String[] args){
        int[] array={6,2,3};
        System.out.println(lastOccurence(array,0,5));
    }
}