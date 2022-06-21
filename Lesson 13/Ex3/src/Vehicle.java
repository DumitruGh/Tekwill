public class Vehicle {
    protected String licensPlate;

    public Vehicle(String licensPlate){
        this.licensPlate = licensPlate;
    }

    public String toString(){
        return "Vehicle{licensePlate=" + licensPlate +"}";
    }
}
