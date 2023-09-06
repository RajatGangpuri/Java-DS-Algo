//Exception handling

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] mark=new int[3];
        mark[0]=2;
        mark[1]=3;
        mark[2]=0;
        try {
            System.out.println(mark[0]/mark[6]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound error");
        }
        catch(Exception e){
            System.out.println(" any other exception");
        }
        
    }
}
