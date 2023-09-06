
//Nested Exception handling

public class NestedExceptionHandling {

    public static void main(String[] args) {
        int[] mark=new int[3];
        mark[0]=2;
        mark[1]=3;
        mark[2]=0;
        try {
            try {
                System.out.println(mark[0]/mark[2]);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(" any other exception");
        }
    }
}
