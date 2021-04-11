/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author farul
 */
public class TugasD {
    public static void main(String[] Args) {
        
        
        int barang1, barang2, barang3, barang4, barang5, jumlah = 0;
        String nama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("Kharisma Agung Plaza < KAP >");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println("Dengan Harga Minimum Rp 10000,00");
        System.out.println("----------------------------------------");
        
        System.out.print("Masukkan Nama Pembeli : ");
        nama = input.nextLine();
        
        
        System.out.print("Masukkan harga barang ke-1 : ");
        barang1 = input.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        barang2 = input.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        barang3 = input.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        barang4 = input.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        barang5 = input.nextInt();
        
        jumlah = barang1 + barang2 + barang3 + barang4 + barang5;
        System.out.println("Total harga pembelian atas nama " + nama + " Adalah RP : " + jumlah);
        System.out.println("Selamat. . .");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        System.out.println("----------------------------------------");   
        
        
        System.out.println("Terima Kasih");
        System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
        
    }
}
