// will create Half Pyramid 2
//import java.util.*;
public class HalfPyramid2 {
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        //int num=scan.nextInt();
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=1;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

