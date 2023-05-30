class CarvedFlower extends Flower{
    private double price;
    private String material;
    public CarvedFlower(String instruction,String material,double PriceperUnit){
        super(instruction);
        this.material = material;
        this.price = PriceperUnit;
    }
    public String toString(){
        return "Carved flower : Price = "+price+" $US. Material = "+material+". "+getInstruction();
    }
}