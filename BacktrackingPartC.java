// find subsets using stringbuilder 
// Backtracking concept
public class BacktrackingPartC {

    public static void findSubsets(String str,StringBuilder ans,int i){
        if(i==str.length()){
            System.out.println(ans.toString());
            return;
        }

        findSubsets(str,ans.append(str.charAt(i)),i+1);
        ans.deleteCharAt(ans.length() - 1);
        findSubsets(str,ans,i+1);
    }
    public static void main(String[] args){
        String str="abc";
        StringBuilder ans=new StringBuilder();
        findSubsets(str,ans,0);
    }
}
