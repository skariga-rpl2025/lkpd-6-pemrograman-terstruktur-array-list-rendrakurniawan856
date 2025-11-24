
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendra kurniawan
 */
public class CariArray {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("## Program Java Pencarian Array ##");
       System.out.println("=============================");
       System.out.println("");
       
       int[] arr = new int[100];
        int arr_count, i, num;

        System.out.print("Input jumlah elemen array: ");
        arr_count = input.nextInt();

        System.out.println("Input " + arr_count + " angka (dipisah dengan spasi): ");
        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();
        System.out.print("Input angka yang akan dicari: ");
        num = input.nextInt();

        // proses pencarian array
        for (i = 0; i < arr_count; i++) {
            if (arr[i] == num) {
                System.out.println("Angka ditemukan pada index ke-" + i);
                break;
            }
        }

        if (i == arr_count) {
            System.out.println("Angka tidak ditemukan");
        }

        System.out.println();
    }
}
       
    

