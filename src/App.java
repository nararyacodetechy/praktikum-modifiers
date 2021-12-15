import duadimensi.Jajargenjang;
import duadimensi.Lingkaran;
import duadimensi.Segitiga;
import duadimensi.Trapesium;
import duadimensi.Belahketupat;

import tigadimensi.Kerucut;
import tigadimensi.LimasSegiEmpat;
import tigadimensi.LimasSegitiga;
import tigadimensi.PrismaSegiEmpat;
import tigadimensi.Balok;

public class App {
    public static void main(String[] args) throws Exception {
        Jajargenjang dimensi = new Jajargenjang(5.0, 7.0);
        System.out.println("Luas Jajargenjang = " + dimensi.luas());

        Trapesium dimensi6 = new Trapesium(5.0, 7.0, 4.5);
        System.out.println("Luas Trapesium = " + dimensi6.luas());

        Lingkaran dimensi1 = new Lingkaran(5.0);
        System.out.println("Luas Lingkaran = " + dimensi1.luas());

        Segitiga dimensi2 = new Segitiga(3.0, 6.0);
        System.out.println("Luas Segitiga = " + dimensi2.luas());

        Belahketupat dimensi3 = new Belahketupat(4.0, 5.0);
        System.out.println("Luas Belahketupat = " + dimensi3.luas());

        Kerucut dimensi4 = new Kerucut(5.0, 2.0);
        System.out.println("Volume Kerucut = " + dimensi4.volume());

        Balok dimensi5 = new Balok(5.0, 4.0, 2.0);
        System.out.println("Volume Balok = " + dimensi5.volume());

        LimasSegiEmpat dimensi7 = new LimasSegiEmpat(5.0, 4.0, 2.0);
        System.out.println("Volume LimasSegiEmpat = " + dimensi7.volume());

        LimasSegitiga dimensi8 = new LimasSegitiga(4.0, 5.0, 8.0);
        System.out.println("Volume LimasSegitiga = " + dimensi8.volume());

        PrismaSegiEmpat dimensi9 = new PrismaSegiEmpat(4.0, 5.0, 8.0);
        System.out.println("Volume PrismaSegiEmpat = " + dimensi9.volume());
    }
}
