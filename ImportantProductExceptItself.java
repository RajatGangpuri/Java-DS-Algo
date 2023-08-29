
//https://www.geeksforgeeks.org/a-product-array-puzzle/

//Product of Array except itself

class ImportantProductExceptItself {
    public static void find(int[] array){
        int multiply=1;
        int product=array[array.length-1];
        int[] left=new int[array.length];
        for(int i=0;i<array.length;i++){
            multiply=multiply*array[i];
            left[i]=multiply;
        }
        for(int i=array.length-1;i>=0;i--){
            if(array[i]==array[array.length-1]){
                array[i]=left[array.length-2];
            }
            else if(array[i]==array[0]){
                array[i]=product;
            }
            else{
                int current=left[i-1]*product;
                product=product*array[i];
                array[i]=current;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] array={10,3,5,6,2};
        find(array);
    }
}