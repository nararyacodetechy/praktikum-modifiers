package tigadimensi;

import duadimensi.PersegiPanjang;

public class LimasSegiEmpat extends PersegiPanjang {
    double tinggi;
    final double Sepertiga = 0.3;

    public LimasSegiEmpat(Double Panjang, double Lebar, double tinggi) {
        super(Panjang, Lebar);
        this.tinggi = tinggi;
    }

    public Double volume() {
        return Sepertiga * super.luas() * tinggi;
    }
}
