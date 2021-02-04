package Yee;

import java.util.Scanner;

public class Lingkaran {

    Scanner S = new Scanner(System.in);

    public void hitung(){
        System.out.print("Masukkan jari - jari lingkaran : ");
        double r = S.nextDouble();
        S.nextLine();
        double hasil = Math.PI * (r * r);
        System.out.println("Hasil luas lingkaran nya adalah : " + (float)hasil);
    }
}
