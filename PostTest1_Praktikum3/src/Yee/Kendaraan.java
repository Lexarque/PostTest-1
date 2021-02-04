package Yee;

import java.util.Scanner;

public class Kendaraan {

    public static void input(String[] many){
        Scanner S = new Scanner(System.in);
        System.out.print("Masukkan nama mobil : ");
        many[0] = S.nextLine();
        System.out.print("Masukkan Manufacturer mobil : ");
        many[1] = S.nextLine();
        System.out.print("Masukkan nomor plat mobil : ");
        many[2] = S.nextLine();
        System.out.print("\n");
    }
    public static void print(String[] many){
        System.out.println("INGFO CUYY = ");
        System.out.println("Merk mobil : " + many[0]);
        System.out.println("Manufacturer mobil : " + many[1]);
        System.out.println("Plat Mobil : " + many[2]);
    }
}
