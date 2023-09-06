import java.util.*;
public class Eceptionhandling {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=3;
        marks[1]=2;
        marks[2]=7;
        Scanner sb=new Scanner(System.in);
        boolean f1=true;

        while(f1){
            int n=sb.nextInt();
            try {
                System.out.println(marks[n]);
                f1=false;
            } catch (Exception e) {
                System.out.println("Enter value again");
            }
        }
    }
}
