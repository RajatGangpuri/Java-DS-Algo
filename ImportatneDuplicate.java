
//https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/

//Find duplicates in O(n) time and O(1) extra space | Set 1

class ImportatneDuplicate {
    public static void main(String args[]){
        int[] array={ 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        for(int i=0;i<array.length;i++){
            array[array[i]%array.length]=array[array[i]%array.length]+array.length;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>=array.length*2){
                System.out.print(i+" ");
            }
        }
    }
}