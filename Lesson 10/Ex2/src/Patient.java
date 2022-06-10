public class Patient {
    String name;
    public Patient(String name){
        this.name = name;
    }
    public void say(){
        System.out.println("Hello, my name is " + name + "," +  " and i need a doctor.");
    }
}
