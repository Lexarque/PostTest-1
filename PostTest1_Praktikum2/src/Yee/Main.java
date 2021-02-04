package Yee;

public class Main {

    public static void main(String[] args) {

        Pohon kelapa = new Pohon();
        Pohon cemara = new Pohon();

        System.out.println("Pohon Kelapa : ");
        kelapa.setNama();
        kelapa.setTinggi();

        System.out.println("Pohon Cemara : ");
        cemara.setNama();
        cemara.setTinggi();

        System.out.println("\n" + "Pohon 1 : ");
        System.out.println("Nama pohon : " + kelapa.getNama());
        System.out.println("Tinggi pohon : " + kelapa.getTinggi() + "\n");

        System.out.println("Pohon 2 : ");
        System.out.println("Nama pohon : " + cemara.getNama());
        System.out.println("Tinggi pohon : " + cemara.getTinggi());

    }
}
