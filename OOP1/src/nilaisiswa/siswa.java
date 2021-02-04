package nilaisiswa;

public class siswa {

    //mendefinisikan nilai siswa
    String nama;
    int nilai;

    //method cetak nilai
    public void cetaknilai(){
        System.out.println("Nilai Produktif RPL 5 " + nama + " adalah : " + nilai);
    }

    //method pengecekan
    public boolean lulus(){
        return nilai >= 75;
    }
    public boolean tidaklulus(){
        return nilai < 74;
    }


}
