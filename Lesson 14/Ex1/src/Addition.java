public class Addition extends IntBinaryOperation{

        public Addition(int firstArg, int secondArg){
        super(firstArg,secondArg);
    }

    public int perform(){
        return firstArg + secondArg;
    }

}
