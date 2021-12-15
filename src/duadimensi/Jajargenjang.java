package duadimensi;

public class Jajargenjang {
    double alas;
    double tinggi;

    public Jajargenjang(double inputalas, double inputtinggi) {
        this.alas = inputalas;
        this.tinggi = inputtinggi;
    }

    public Double luas() {
        return alas * tinggi;
    }
}
