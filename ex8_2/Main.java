public class Main{
    public static void main(String []args){
        Flower cauly = new Cauliflower("Boil before stir fry.", 30);
        Flower soapFlower = new CarvedFlower("For room decoration.","Soap",4);
        Flower carrie = new WallFlower();
        
        System.out.println(cauly);
        System.out.println(soapFlower);
        System.out.println(carrie);
    }
}