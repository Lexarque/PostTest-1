package Yee;

import java.util.Scanner;

public class Persegi {

    Scanner S = new Scanner(System.in);

    public void hitung(){
        System.out.print("Masukkan sisi persegi : ");
        double s = S.nextDouble();
        S.nextLine();
        double hasil = s * s;
        System.out.println("Hasil luas lingkaran nya adalah : " + (float)hasil);
    }
}
