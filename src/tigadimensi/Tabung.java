package tigadimensi;

import duadimensi.Lingkaran;

public class Tabung extends Lingkaran {
    Double tinggi;

    public Tabung(Double r, Double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    Double volume() {
        return super.luas() * tinggi;
    }
}
// 2πr(r + t)

// volume tabung = π x r x r x t.