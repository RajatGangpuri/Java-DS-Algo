//Butterfly effect

public class HashMapQuestion {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i+2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
