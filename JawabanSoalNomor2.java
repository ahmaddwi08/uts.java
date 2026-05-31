/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsmester2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class JawabanSoalNomor2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Meminta jumlah produk agar ukuran array bisa dinamis
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();
        input.nextLine(); 
        
        // Inisialisasi array berdasarkan jumlah produk yang diinput
        String[] namaProduk = new String[jumlahProduk];
        int[][] DataPenjualan = new int[jumlahProduk][7]; 
        
        // 2. Proses Input Nama Produk dan Data Penjualan
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print("\nMasukkan nama produk ke " + (i + 1) + ": ");
            namaProduk[i] = input.nextLine();
            
            System.out.println("Masukkan penjualan untuk " + namaProduk[i] + " selama 7 hari:");
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                DataPenjualan[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        
        // 3. Proses Menampilkan Tabel dan Perhitungan
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Produk | Hari-1 | Hari-2 | Hari-3 | Hari-4 | Hari-5 | Hari-6 | Hari-7 | Total");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        int produkTertinggiIndeks = 0;
        int penjualanTertinggi = 0;
        
        for (int i = 0; i < DataPenjualan.length; i++) {
           
            System.out.printf("%-11s | ", namaProduk[i]);
    
            int totalPenjualanProduk = 0;
    
            for (int j = 0; j < DataPenjualan[i].length; j++) {
                System.out.print(DataPenjualan[i][j] + "\t");
                
                totalPenjualanProduk += DataPenjualan[i][j]; 
            }
    
            System.out.println("| " + totalPenjualanProduk);
    
            // Menentukan produk dengan penjualan tertinggi
            if (totalPenjualanProduk > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualanProduk;
                produkTertinggiIndeks = i;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // 4. Output Kesimpulan
        System.out.println("\nProduk Dengan Penjualan Tertinggi: " + namaProduk[produkTertinggiIndeks].trim() +
                            " (Total Penjualan: " + penjualanTertinggi + ")");
        
        input.close(); 
    }
}
