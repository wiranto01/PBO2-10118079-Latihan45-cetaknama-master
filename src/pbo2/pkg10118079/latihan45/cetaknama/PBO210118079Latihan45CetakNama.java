/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan45.cetaknama;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class PBO210118079Latihan45CetakNama {
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("======Aplikasi Pencetakan Nama====== ");
        Scanner userInput = new Scanner(System.in);
        printer hasil = new printer();
        System.out.println("Masukkan nama anda : ");
        hasil.setNama(userInput.nextLine()) ;
        System.out.println("Mau cetak nama berapa kali? :");
        hasil.setJmlcetak( userInput.nextInt()) ;
         
     hasil.cetak(hasil.getNama());
        hasil.cetak1(hasil.getJmlcetak(),hasil.getNama());
  
        
    }
}
