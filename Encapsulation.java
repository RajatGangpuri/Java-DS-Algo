class Animal{
    private String sound;

    public String getMethod(){     //necessary to define get and set method in the class private variable mentioned
        return sound;
    }
    public void setMethod(String newsound){  //method should start with lowercase letter
        this.sound=newsound;
    }
}    
public class Encapsulation {
    public static void main(String[] args){
        Animal obj=new Animal();
        obj.setMethod("Rajat");
        System.out.println(obj.getMethod());
    }
}
