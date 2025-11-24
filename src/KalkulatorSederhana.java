

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.println("Pilih Operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("\nMasukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("\nHasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("\nHasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("\nHasil perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("\nHasil pembagian: " + hasil);
                } else {
                    System.out.println("\nError: Pembagi tidak boleh 0!");
                }
                break;
            default:
                valid = false;
                System.out.println("\nPilihan tidak valid!");
        }

        input.close();
    }
}
