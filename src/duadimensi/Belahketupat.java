package duadimensi;

public class Belahketupat {
    public double d1;
    public double d2;
    final double seperdua = 0.5;

    public Belahketupat(double diagonal1, double diagonal2) {
        this.d1 = diagonal1;
        this.d2 = diagonal2;
    }

    public Double luas() {
        return seperdua * d1 * d2;
    }
}
