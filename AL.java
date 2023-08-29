//Remove Consecutive Characters
import java.util.*;
public class AL{

    public static String find(String str){
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=1;
        if(str.length()==1){
            return str;
        }
        while(j<str.length()){
            if(str.charAt(i)!=str.charAt(j)){
                sb.append(str.charAt(i));
            }
            else{
                sb.append(str.charAt(i));
                i++;
                j++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str="aabb";
        System.out.print(find(str));
    }
}