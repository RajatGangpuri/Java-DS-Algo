//Permutation by using recusrssion
public class Function{
    static void printPerm(String str, String permutation){
        if(str.length()==0){
            System.out.print(" end permutation="+permutation);
            return;
        }
        System.out.print("1 ");
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            System.out.println("index="+i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            System.out.println(" Curr character="+currChar+" new String="+newStr+" Permutation="+permutation+" 3 ");
            printPerm(newStr,permutation+currChar);
            System.out.print("4 ");
            System.out.println("end index="+i);
            
        }
        System.out.print("paltu");
    }
    public static void main(String args[]){
        String str="abc";           
        printPerm(str,"");
        System.out.println("10");
    }
}
