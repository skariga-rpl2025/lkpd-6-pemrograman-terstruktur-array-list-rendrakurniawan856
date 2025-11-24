/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author rendra kurniawan
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        databaseMahasiswa db = new databaseMahasiswa();
        
        int pilih;
        do {
            System.out.println("\n===== MENU APLIKASI MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus  Data");
            System.out.println("5. Tampikan Semua Data");
            System.out.println("0. keluar");
            System.out.println("Pilih menu");
            pilih = input.nextInt();
            input.nextLine(); // clear buffer
            
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan NPM:");
                    String npm = input.nextLine();
                     System.out.println("Masukkan Nama:");
                    String nama = input.nextLine();
                     System.out.println("Masukkan Alamat:");
                    String alamat = input.nextLine();
                    db.tambahMahasiswa(new Mahasiswa (npm, nama, alamat));
                    break;
                    
                case 2:
                     System.out.println("Masukkan NPM yang dicari:");
                    String cari = input.nextLine();
                    Mahasiswa m = db.cariMahasiswa(cari);
                    if (m != null)
                        System.out.println("Data ditemukan:" +m);
                    else
                        System.out.println("Data tidak ditemukan.");
                    break;
                    
                case 3 :
                     System.out.println("Masukkan NPM yang akan diedit:");
                    String npmEdit = input.nextLine();
                     System.out.println("Nama baru:");
                    String namaBaru = input.nextLine();
                     System.out.println("Alamat baru:");
                    String alamatBaru = input.nextLine();
                    db.editMahasiswa(npmEdit, namaBaru, alamatBaru);
                    break;
                    
                case 4:
                     System.out.println("Masukkan NPM yang akan dihapus:");
                    String npmHapus = input.nextLine();
                    db.hapusMahasiswa(npmHapus);
                    break;
                    
                case 5:
                    db.tampilkanSemua();
                    break;
                    
                case 0:
                    System.out.println("Keluar...");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
    }
}
