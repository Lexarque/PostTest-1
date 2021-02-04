package Yee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();
        boolean c = true;

        while(c){

            System.out.println("Anda ingin menghitung luas lingkaran atau persegi? ");
            System.out.print("(masukkan nama bangun datar) : ");
            String a = S.nextLine();

            if(a.equalsIgnoreCase("lingkaran")){
                l.hitung();
                c = false;
            }else if(a.equalsIgnoreCase("persegi")){
                p.hitung();
                c = false;
            }else{
                System.out.println("Bangun ruang tidak ditemukan ! \n");
            }
        }
    }
}
