/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author farul
 */
public class TugasA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int batasAwal, batasAkhir;

        System.out.println("Masukkan batas awal bilangan : ");
        batasAwal = in.nextInt();

        System.out.println("Masukkan batas akhir bilangan : ");
        batasAkhir = in.nextInt();

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }

        }

    }
}
