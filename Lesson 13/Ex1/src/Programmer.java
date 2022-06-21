public class Programmer {
    protected int numProgrammer;
    public Programmer(int numProgrammer){
        this.numProgrammer = numProgrammer;
        employ();
    }

    private void employ(){
        System.out.println(numProgrammer + " programmer");
    }
}
