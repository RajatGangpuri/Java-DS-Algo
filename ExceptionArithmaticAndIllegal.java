//Arithmetic and Illegal Exception

public class ExceptionArithmaticAndIllegal {
    public static void main(String[] args) {
        int a =2;
        int b=0;
        try {
            int c=a/b;
            System.out.println("Answer- "+ c);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("hihi");
        }
    }
}
