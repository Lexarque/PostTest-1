package Yee;

import java.util.Scanner;

public class Pohon {

    Scanner S = new Scanner(System.in);

    String nama;
    int tinggi;

    public void setNama(){
        System.out.print("Masukkan nama pohon : ");
        nama = S.nextLine();
    }
    public void setTinggi(){
        System.out.println("Masukkan Tinggi Pohon : ");
        System.out.print("(Satuan CM) : ");
        tinggi = S.nextInt();
    }
    public String getNama(){
        return nama;
    }
    public int getTinggi(){
        return tinggi;
    }
}
