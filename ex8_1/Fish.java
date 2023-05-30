public class Fish{
    private double weight;
    public Fish(double weight){
        this.weight = weight;
    }
    public void swim(){
        System.out.print(" All fish can swim.\n");
    }
    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "I am a "+getWeight()+" kg fish.";
    }
}