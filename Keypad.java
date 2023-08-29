//https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
// mOBILE NUMBER ALPHA
public class Keypad{
    public static void find(String str,int[] array){
        if(str.length()==0){
            System.out.print("");
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.print(0);
            }
            else{
                int position=str.charAt(i)-'A';
                System.out.print(array[position]);
            }
        }
    }
    public static void main(String[] args){
        String str="GEEKSFORGEEKS";
        int[] array={2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,9999};
        find(str,array);
    }
}