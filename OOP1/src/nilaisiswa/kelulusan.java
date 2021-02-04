package nilaisiswa;

public class kelulusan {

    public static void main(String[] args) {

        siswa s = new siswa();

        //pengisian atribut pelajar

        s.nama = "Anya";
        s.nilai = 80;

        //menjalankan method

        s.cetaknilai();

        //menentukan lulus

        if (s.lulus()) {
            System.out.println("Selamat anda lulus");
        } else if (s.tidaklulus()) {
            System.out.println("Anda harus belajar lebih giat lagi");
        }

    }

}
