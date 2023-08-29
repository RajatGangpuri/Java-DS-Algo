import java.util.*;
public class StringLongestUniqueSubString{
    public static Integer check(String str){
        HashMap<Character,Integer> hash=new HashMap<>();
        int i=-1;
        int j=-1;
        int len=0;
        int ans=0;
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(i<str.length()-1){
                f1=true;
                i++;
                
                char ch=str.charAt(i);
                if(hash.containsKey(ch)){
                    hash.put(ch,hash.get(ch)+1);
                }
                else{
                    hash.put(ch,1);
                }
                if(hash.get(ch)==2){
                    break;
                }
                else{
                    len=i-j;
                    if(len>ans){
                        ans=len;
                    }
                }
            }
            while(j<i){
                j++;
                f2=true;
                char ch=str.charAt(j);
                hash.put(ch,hash.get(ch)-1);
                if(hash.get(ch)==1){
                    break;
                }
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print(check("tmmzuxt"));
    }
}