import java.util.*;
public class HeapImplimentation {
    static class Heap{
        ArrayList<Integer> array=new ArrayList<>();
        public void add(int data){
            array.add(data);
            int x=array.size()-1; //index of child
            int par=(x-2)/2; // index of parents as per formula
            //Node index(add index)=i
            // left Index=2i+1  right index=2i+2
            while(array.get(par)<array.get(x)){
                int temp=array.get(par);
                array.set(array.get(par),array.get(x));
                array.set(array.get(x),temp);
            }
        }
    }
    public static void main(String[] args){

    }
}
