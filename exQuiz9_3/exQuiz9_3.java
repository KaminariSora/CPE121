class exQuiz9_3{
    public static void main(String []args){
        Animal tiger = new Tiger();
        System.out.println(tiger.sound());
        Chicken chicken = new Chicken();
        System.out.println(chicken.sound());
        System.out.println(chicken.howToEat());
        Edible fruit = new Fruit();
        System.out.println(fruit.howToEat());
        Fruit orange = new Orange();
        System.out.println(orange.howToEat());
    }
}

interface Edible{
    public String howToEat();
}

class Fruit implements Edible{
    public String howToEat(){
        return "Fruit = 'Fruit is healthy food.'";
    }
}

class Orange extends Fruit{
    public String howToEat(){
        return "Orange: Make orange juice.";
    }
}

class Animal{
    public String sound(){
        return "Tiger: Heheeeee";
    }
}

class Tiger extends Animal{
    public String sound(){
        return "Tiger: RRROARRR";
    }
}

class Chicken extends Animal implements Edible{
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
    public String howToEat(){
        return "Chicken: Fry it.";
    }
}