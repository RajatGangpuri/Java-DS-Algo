public class SortCount {


    public static String countSort(String str){
        int[] count=new int[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            while(count[i]>0){
                sb.append((char)(i+'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }



    public static void main(String[] args){
        String str="edsdab";
        System.out.print(countSort(str));
    }
}
