package tigadimensi;

import duadimensi.PersegiPanjang;

public class PrismaSegiEmpat extends PersegiPanjang {
    double tinggiPrisma;
    final double Sepertiga = 0.3;

    public PrismaSegiEmpat(Double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    public Double volume() {
        return Sepertiga * super.luas() * tinggiPrisma;
    }
}

// V = 1/3 x La x t