/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;
import java.util.ArrayList;
/**
 *
 * @author rendra kurniawan
 */
public class databaseMahasiswa {
   
    private ArrayList<Mahasiswa> list = new ArrayList<>();
    
    public void tambahMahasiswa(Mahasiswa mhs){
      list.add(mhs);
      System.out.println("Data berhasil ditambahkan!");
    }
    
    public Mahasiswa cariMahasiswa(String npm) {
        for (Mahasiswa m: list) {
            return m;
        }
        return null;
    }
    
    public void editMahasiswa(String npm, String namaBaru, String alamatBaru){
        Mahasiswa m = cariMahasiswa(npm);
        if (m != null){
            m.setNama(namaBaru);
            m.setAlamat(alamatBaru);
            System.out.println("Data berhasil diupdate!");
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    
    public void hapusMahasiswa(String npm){
         Mahasiswa m= cariMahasiswa (npm);
        if (m != null){
        list.remove(m);
        System.out.println("Data berhasil dihapus!");
        } else {
        System.out.println("Data tidak ditemukan!"); 
        }
    }
    
public void tampilkanSemua() {
    if (list.isEmpty()) {
      System.out.println("Belum ada data");
    } else{
        for (Mahasiswa m: list){
          System.out.println(m);
        }
    }
}
}

