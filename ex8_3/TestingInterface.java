public class TestingInterface{
    public static void main(String []args){
        Flyable duck = new Duck();
        Flyable plane = new Plane();
        duck.fly();
        plane.fly();
    }
}

interface Flyable{
    public void fly();
} 

class Duck implements Flyable{
    public void fly(){
        System.out.println("I am duck.");
    }
}

class Plane implements Flyable{
    public void fly(){
        System.out.println("I am plane.");
    }
}