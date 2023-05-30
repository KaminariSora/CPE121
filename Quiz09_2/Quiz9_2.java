class Quiz9_2{
  public static void main(String []args){
    Animal cats = new Cat();
    System.out.println(cats.eat());
    Birth cat = new Cat();
    System.out.println(cat.howToBirth());
    Birth bird = new Bird();
    System.out.println(bird.howToBirth());
    Birth elephant = new Elephant();
    System.out.println(elephant.howToBirth());
    Birth eagle = new Eagle();
    System.out.print(eagle.howToBirth());
    Birth ostrich = new Ostrich();
    System.out.println(ostrich.howToBirth());
  }
}
abstract class Animal{
  public abstract String eat();
}
interface Birth{
  public String howToBirth();
}

class Bird implements Birth{
  public String howToBirth(){
    return "Birds hatch from eggs.";
  }
}

class Elephant implements Birth{
  public String howToBirth(){
    return "Elephants were born from mother's womb.";
  }
}
  
class Eagle extends Bird{
  public String howToBirth(){
    return "Eagle is a big bird that can fly.";
  }
}

class Ostrich extends Bird{
  public String howToBirth(){
    return "Ostrich is a big bird that cannot fly";
  }
}
  
class Cat extends Animal implements Birth{
  public String howToBirth(){
    return "Cats were born from mother's womb.";
  }
  public String eat(){
    return "Cats: I can eat both plants and meat.";
  }
}