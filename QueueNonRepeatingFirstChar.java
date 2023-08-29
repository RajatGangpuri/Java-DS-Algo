
import java.util.*;
import java.util.LinkedList;
public class QueueNonRepeatingFirstChar{

    public static void findNonRepeating(String str){
        Queue<Character> q=new LinkedList<>();
        char[] ch1=new char[26];
        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
            ch1[str.charAt(i)-'a']++;
            while(!q.isEmpty() && ch1[q.peek()-'a']>1){
            q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1 +" ");
            }
            else{
                System.out.print(q.peek()+ " ");
            }
        }
    }

    public static void main(String[] args){
        String str="aabccxb";
        findNonRepeating(str);
    }
}