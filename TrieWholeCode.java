
//Trie Data Structure
import java.util.Arrays;
public class TrieWholeCode{
    static class Node{
        boolean eow;
        Node[] child=new Node[26];
        Node(){
            this.eow=false;
            for(int i=0;i<26;i++){
                this.child[i]=null;
            }
        }
    }

    //insert
    static Node root=new Node();
    public static void insert(String word){
        Node currNode=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(currNode.child[index]==null){
                currNode.child[index]=new Node();
            }
            if(i==word.length()-1){
                currNode.child[index].eow=true;
            }
            currNode=currNode.child[index];
        }
    }

    //search
    public static boolean search(String value){
        Node currNode=root;
        for(int i=0;i<value.length();i++){
            int index=value.charAt(i)-'a';
            if(currNode.child[index]==null){
                return false;
            }
            if(i==value.length()-1 && currNode.child[index].eow==false){
                return false;
            }
            currNode=currNode.child[index];
        }
        return true;
    }

    //Find Prefix in Trie
    public static String searchPrefix(String value){
        Node currNode=root;
        String str="";
        for(int i=0;i<value.length();i++){
            int index=value.charAt(i)-'a';
            if(currNode.child[index]!=null){
                break;
            }
            else{
                str=str+value.charAt(i);
            }
            currNode=currNode.child[index];
        }
        return str;
    }

    //Word Break Problem

    public static boolean wordBreakProblem(String word){
        if(word.length()==0){
            return true;
        }
        for(int i=1;i<=word.length();i++){
            String firstPart=word.substring(0,i);
            String secondPart=word.substring(i);
            if(search(firstPart) && wordBreakProblem(secondPart)){
                return true;
            }
        }
        return false;
    }

    //Longest Word with prefix [fl,flow,flower]

    public static String longestPrefix(String[] words){
        String str="";
        Arrays.sort(words);
        String word1=words[0];
        String word2=words[words.length-1];
        int min=Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            if(word1.charAt(i)==word2.charAt(i)){
                str=str+word1.charAt(i);
            }
            else{
                break;
            }
        }
        return str;
    }

    //Count unique Suffix
    //Step1 -find suffix
    //Step2- insert in trie
    //step3- find number of nodes, as number of nodes of trie =unique substring
    
    //Find suffix
    public static void suffix(String word){
        String str="";
        String[] temp=new String[word.length()];
        for(int j=0;j<word.length();j++){
            str=word.substring(j);
            temp[j]=str;
        }
        for(int i=0;i<temp.length;i++){
            insert(temp[i]);
        }
    } 


    //Count unique suffix
    public static int count(Node root){
        Node currNode=root;
        if(root==null){
            return 0;
        }
        int Count=0;
        for(int i=0;i<26;i++){
            if(currNode.child[i]!=null){
                Count+=count(currNode.child[i]);
            }
        }
        return Count+1;
    }

    
    public static void main(String[] args){
        String[] words={"fl","alpha","beta"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        
        System.out.println(search("fla"));
        System.out.println(longestPrefix(words));
        System.out.println(wordBreakProblem("flflofla"));
        suffix("ababa");
        System.out.println(count(root));
        System.out.println(searchPrefix("alp"));
    }
}