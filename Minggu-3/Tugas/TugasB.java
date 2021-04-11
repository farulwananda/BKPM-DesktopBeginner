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
public class TugasB {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Silahkan input jumlah deret angka : ");
        
         int jumlah = scan.nextInt();
        int[] angka = new int[jumlah];
        for (int i = 0; i < angka.length; i++){
            angka[i] = (int)(Math.random() * 100);
            System.out.print(angka[i] + " ");
        }
        System.out.println("");
        
    }
    
}
