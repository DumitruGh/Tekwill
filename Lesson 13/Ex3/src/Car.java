public class Car extends Vehicle{
    protected int numberOfSeats;
    public Car(String licensPlate, int numberOfSeats){
        super(licensPlate);
        this.numberOfSeats = numberOfSeats;
    }
          //Car{licensePlate=ABC123,numberOfSeats=4}
      public String toString(){
        return "Car{licensePlate=" + licensPlate +"," +  "numberOfSeats=" + numberOfSeats + "}";
      }
}
