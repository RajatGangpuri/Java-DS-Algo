// Longest Palindromic Subsequence

class StringLongestPalindromicSubSequeence {
    public static int check(String s){
        //int count=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();i++,j++){
                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2;
                    }
                    else{
                        dp[i][j]=1;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2+dp[i+1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[0][s.length()-1];
    }
        
    public static void main(String[] args){
        String s = "abab";
        System.out.print(check(s));
        
    }
}