class Cauliflower extends Flower{
    private double price;
    public Cauliflower(String instruction,double PriceperKg){
        super(instruction);
        this.price = PriceperKg;
    }
    public String toString(){
        return "CauliFLower : Price = "+price+" bath/kg. "+getInstruction();
    }
}