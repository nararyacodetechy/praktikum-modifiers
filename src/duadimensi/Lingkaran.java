package duadimensi;

public class Lingkaran {
    Double jari;
    final Double phi = 3.14;

    public Lingkaran(Double jari) {
        this.jari = jari;
    }

    public Double luas() {
        return phi * jari * jari;
    }
}
