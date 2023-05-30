public class exQuiz9_1{
    public static void main(String []args){
        Animal animal = new Cat();
        System.out.println(animal.eat());
        Birth cat = new Cat();
        System.out.println(cat.howToBirth());
        Birth elephant = new Elephant();
        System.out.println(elephant.howToBirth());
        Birth bird = new Bird();
        Bird berb = new Bird();
        System.out.println(berb.howTofly());
        System.out.println(bird.howToBirth());
        Bird eagle = new Eagle();
        System.out.println(eagle.howTofly());
        Bird ostrich = new Ostrich();
        System.out.println(ostrich.howTofly());
    }
}

class Animal{
    public String eat(){
        return "Cats: I can eat both plants and meat.";
    }
}

class Cat extends Animal implements Birth{
    public String howToBirth(){
        return "Cats were born from mother womb.";
    }
    public String howTofly(){
        return "";
    }
}
interface Birth{
    public String howToBirth();
}

class Elephant implements Birth{
    public String howToBirth(){
        return "Elephant were born from mother womb.";
    }
}

class Bird implements Birth{
    public String howToBirth(){
        return "Birds hatch from egg.";
    }
    public String howTofly(){
        return "Bird can fly";
    }
}

class Eagle extends Bird{
    public String howTofly(){
        return "Eagle is a big bird that can fly.";
    }
}

class Ostrich extends Bird{
    public String howTofly(){
        return "Ostrich is a big bird that cannot fly.";
    }
}