import java.util.Objects;

public class ComplexNumber {
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexNumber)) {
            return false;
        }
        ComplexNumber complex = (ComplexNumber) obj;
        return Double.compare(complex.re, re) == 0 &&
                Double.compare(complex.im, im) == 0;

    }
    public int hashCode(){
        return Objects.hash(re,im);
    }

    }

