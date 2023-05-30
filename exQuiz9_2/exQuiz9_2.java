class exQuiz9_2{
    public static void main(String []args){
        Vehicle vehicle = new Vehicle();
        Passenger taxi = new Taxi();
        System.out.println(vehicle.drive());
        System.out.println(taxi.howToPayMoney());
        Passenger bts = new BTS();
        System.out.println(bts.howToPayMoney());
        Passenger bus = new Bus();
        Bus paybus = new Bus();
        System.out.println(bus.howToPayMoney());
        System.out.println(paybus.howMuchRate());
        FanRate fanrate = new FanRate();
        System.out.println(fanrate.howMuchRate());
        AirRate airrate = new AirRate();
        System.out.println(airrate.howMuchRate());
    }
}

class Vehicle{
    public String drive(){
        return "Taxi: Deal the diraection and then take a seat and fasten safety belt.";
    }
}

interface Passenger{
    public String howToPayMoney();
}

class Taxi extends Vehicle implements Passenger{
    public String howToPayMoney(){
        return "Taxi: Check the distances and cost from meter. Pay money.";
    }
}

class BTS implements Passenger{
    public String howToPayMoney(){
        return "BTS: Check the station rate and insert coins. Get ticket.";
    }
}

class Bus implements Passenger{
    public String howToPayMoney(){
        return "Bus: Tell the station and pay money.Get ticket.";
    }
    public String howMuchRate(){
        return "Normal bus >> rate 7 baht.";
    }
}

class FanRate extends Bus{
    public String howMuchRate(){
        return "Euro bus(air) >> Rate 15 baht.";
    }
}

class AirRate extends Bus{
    public String howMuchRate(){
        return "NOrmal bus + fan >> Rate = 11 baht.";
    }
}