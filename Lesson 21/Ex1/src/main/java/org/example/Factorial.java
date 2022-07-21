package org.example;

public class Factorial {
    public long get(int x) {

            if(x<0){
                return -1;
            }
            if(x==0){
                return 1;
            }
        int factorial = 1;
        for (int y = 1; y <= x; y++) {
            factorial = factorial * y;
        }
        return factorial;
    }
}
