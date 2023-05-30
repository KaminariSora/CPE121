class SaltedDriedFish extends Fish{
    public SaltedDriedFish(double weight){
        super(weight);
    }
    public void swim(){
        System.out.print(" I am already dead and no longer swim.");
    }
    public String toString(){
        return "I am a "+getWeight()+" kg salted dried fish.";
    }
}