// Longest Palindromic Substrings

class StringLongestPalindromicSubstring{
    public static String check(String s){
        int count=0;
        String str="";
        String realstr="";
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j]){
                    str=s.substring(i,j+1);
                    if(count<str.length()){
                        realstr=str;
                        count=str.length();
                    }
                }
            }
        }
        return realstr;
    }
        
    public static void main(String[] args){
        String s = "abcd";
        System.out.print(check(s));
    }
}