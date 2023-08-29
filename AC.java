
public class AC{

    public static void divide(int[] array){
        int product=1;
        int multiply=1;
        int[] left=new int[array.length];
        for(int i=0;i<array.length;i++){
            product=product*array[i];
            left[i]=product;
        }
        for(int i=array.length-1;i>=0;i--){
            if(array[i]==array[array.length-1]){
                array[i]=left[i-1];
            }
            else if(array[i]==array[0]){
                array[i]=product;
            }
            else{
                multiply=multiply*array[i+1];
                array[i]=left[i-1]*multiply;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        divide(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}