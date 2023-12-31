class SuperClass {
    static void superClassStatic(){   //Use first letter of method as lowercase
        System.out.println("Static function of polymorphism super class");
    }
    public void superClassPublic(){    //can use uppercase letter in between method defination Ex superClass
        System.out.println("Public function of polymorphism Super class");
    }
}
class SubClass extends SuperClass{
    static void subClassStatic(){
        System.out.println("static void function of horse (subclass)");
    }
    public void subClassPublic(){
        System.out.println("Public void function of horse(subclass)");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        SuperClass SuperClassObject= new SuperClass();  //object creation of SuperClass 
        SubClass SubClassObject= new SubClass();    //Wy i cant use SuperClass SubClassObject
        //Object creation of SubClass. Dont use like (next line)
        //SuperClass SubClassObject = new Subclass(); This only happen in encapsulation and inheritance

        SuperClass.superClassStatic();
        SubClass.subClassStatic();
        SuperClassObject.superClassPublic();
        SubClassObject.subClassPublic();
    }
}