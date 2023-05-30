class MechanicalFish extends Fish{
    public MechanicalFish(double weight){
        super(weight);
    }
    public void swim(){
        System.out.print(" I float in the water.\n");
    }
    public String toString(){
        return "I am a "+getWeight()+" kg mechanical fish.";
    }
}