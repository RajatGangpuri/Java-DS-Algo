//Inheritance concwepts with code
public class Inheritance_concepts{
    public void Admission(){
        System.out.println("Hello Everyone");
    }
    static void Hello(){
        System.out.println("I can be called only by student class as i am static");
    }
    public class Eleven{
        public void name(String student_name){
            System.out.println(student_name);
        }
        static void class_name(){
            System.out.println("Class 11th");
        }
    }
    public static void main(String[] args){
        Inheritance_concepts myouter=new Inheritance_concepts();    //eleven as an object created to call function of student class
        Inheritance_concepts.Eleven myinner=myouter.new Eleven();  //student1 object to call innerClass(Eleven)

        //eleven.name("Gangpuri");   "will give compile error as outerclass object cant call innerclass object"

        myinner.name("AMAN"); //will return aman as student1 is a innerclass 
        //object and name is innerclass method
        Eleven.class_name(); // class name static method can call only by innerclass
        Inheritance_concepts.Hello(); //class name static method can call only by outerclass
        myouter.Admission(); //outerObject to call outerclass method


        //i can call inner class method from outer class
    }
}
