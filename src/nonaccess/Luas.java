package nonaccess;

public class Luas {

    public static int nilai;

    public static void persegi(int sisi) {
        System.out.println("Luas Persegi = " + sisi * sisi);
    }

    public static void persegiPanjang(int panjang, int lebar) {
        System.out.println("Luas Persegi Panjang = " + panjang * lebar);
    }

    public static void lingkaran(int jari) {
        System.out.println("Luas Lingkaran = " + 3.14 * jari * jari);
    }

    public static void Jajargenjang(int inputluas, int inputtinggi) {
        System.out.println("Luas Jajargenjang = " + inputluas * inputtinggi);
    }
}
