/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;

/**
 *
 * @author farul
 */
public class ConditionalStatement2 {
    public static void main(String[] Args) {
    //variabel dan Scanner
    String lampu;
    Scanner scan = new Scanner(System.in);
    
    //input
    System.out.print("Inputkan nama warna : ");
    lampu = scan.nextLine();
    
    switch (lampu) {
        case "merah":
        System.out.println("Lampu Merah, berhenti!");
        break;
        case "kuning":
        System.out.println("Lampu Kuning, harap hati-hati!");
        break;
        case "hijau":
        System.out.println("Lampu Hijau, silahkan jalan!");
    }
  }
}
