//Abstract class concepts
//How can i call sound method of both abstract and inherit class
abstract class AbstractAnimal { //Abstract class use create emplty method so they can according to the object
    static void laugh(){  //in abstract you can create static, public and abstract method
        System.out.println("animals cant laugh");
    }
    public void sound(){         //this can only call by inherit class object
        System.out.println("Animals make Different sound");
    }
    public abstract void walk(); //abstract method no need to mention body as every object can call with in own style
}
class Horse extends AbstractAnimal{
    public void walk(){
        System.out.println("Walk by 4 legs");
    }
    public void sound(){         //this can only call by inherit class object
        System.out.println("Horse sound shit");
    }
}
class Abstract{
    public static void main(String args[]){
        // AbstractAnimal myobj = new AbstractAnimal(); cant create abstract class object
        Horse myobj=new Horse();  //myobj of Horse class created
        AbstractAnimal.laugh();   //staticfunction called by abstract class
        myobj.sound();            //myobj created by inherit class called abstract class method
        myobj.walk();             //myobj called inherit class method
    }             
}
