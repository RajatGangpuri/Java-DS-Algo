public class BacktrackingPartA {
    public static void changeArr(int[] array,int i,int val){
        if(i==array.length){
            arrPrint(array);
            return;
        }
        array[i]=val;
        changeArr(array,i+1,val+1);
        array[i]=array[i]-2;
    }
    public static void arrPrint(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array=new int[5];
        changeArr(array,0,1);
        arrPrint(array);
    }
}
