public class Quiz9_1{
  public static void main(String []args){
    SuperHero sh = new SuperHero();
    Spiderman sd1 = new Spiderman("Spiderman",19,"I can shoot spider web.");
    Superman sm1 = new Superman();
    SuperHero sm2 = new Superman("Superman","I can fly");
    Batman bm1 = new Batman();
    Batman bm2 = new Batman("batman","My powers come from my technological abillity.");
    System.out.println(sh);
    System.out.println(sd1);
    //System.out.println(sm1);
    System.out.println(sm2);
    System.out.println(bm1);
    //System.out.println(bm2);
  }
}

class SuperHero{
  private String heroName;
  public SuperHero(){
    this.heroName = "SuperHero";
  }
  public SuperHero(String n){
    this.heroName = n;
  }
  public String getHeroName(){
    return this.heroName;
  }
  public String toString(){
    return "I have special power";
  }
}

class Spiderman extends SuperHero{
  private int age;
  private String power;
  public Spiderman(String n,int age,String power){
    super(n);  
    this.age = age;
    this.power = power;
  }
  public String toString(){
    return "I am "+getHeroName()+".I am "+age+" years old."+power;
  }
}

class Superman extends SuperHero{//superman
  private String power;
  private String n;
  public Superman(){
    //super.SuperHero();
  }
  public Superman(String n,String power){
    this.power = power; 
  }
  public String toString(){
    
    return "I am Superhero."+this.power+".I am "+getHeroName()+".I can fly and wear  a red and blye suit.";
  }
}

class Batman extends SuperHero{
  private String power;
  public Batman(){
    super();
  }
  public Batman(String n,String power){
    //super(n);
    this.power = power;
  }
  public String toString(){
    return "I am Superhero.I am rich. I am "+super.getHeroName()+"."+power;
  }
}