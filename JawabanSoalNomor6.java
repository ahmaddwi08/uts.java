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
public class JawabanSoalNomor6 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGURUTAN DATA PRODUK TOKO ===");
        
        // Meminta inputan jumlah produk dari pengguna
        System.out.print("Masukkan jumlah produk yang akan diinput: ");
        int jumlahProduk = input.nextInt();
        input.nextLine(); // Membersihkan sisa baris setelah input angka

        // Mempersiapkan array untuk menyimpan nama dan harga produk
        String[] namaProduk = new String[jumlahProduk];
        int[] hargaProduk = new int[jumlahProduk];

        System.out.println("\n--- Silakan Masukkan Nama Produk ---");
        // Perulangan untuk mengambil inputan nama dan harga sesuai jumlah produk
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Produk ke " + (i + 1) + ":");
            System.out.print("   Nama Produk : ");
            namaProduk[i] = input.nextLine();
            System.out.print("   Harga Produk: Rp ");
            hargaProduk[i] = input.nextInt();
            input.nextLine(); // Membersihkan sisa baris
            System.out.println();
        }

        // b. Menampilkan data SEBELUM sorting
        System.out.println("--------------------------------------------------");
        System.out.println("data produk sebelum di urutkan:");
        tampilkanData(namaProduk, hargaProduk);
        System.out.println("--------------------------------------------------");

        // Proses Sorting menggunakan algoritma Bubble Sort
        bubbleSort(namaProduk, hargaProduk);

        // b. Menampilkan data SESUDAH sorting
        System.out.println("data produk sesudah di urutkan (Termurah ke Termahal):");
        tampilkanData(namaProduk, hargaProduk);
        System.out.println("--------------------------------------------------");

        input.close();
    }

    // Fungsi untuk mengurutkan data harga sekaligus mengikutkan nama produknya
    public static void bubbleSort(String[] nama, int[] harga) {
        int n = harga.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Jika harga di sebelah kiri lebih mahal dari harga di sebelah kanan, posisi ditukar
                if (harga[j] > harga[j + 1]) {
                    
                    // 1. Tukar posisi data harganya
                    int tempHarga = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = tempHarga;

                    // 2. KUNCI PENTING: Nama produk harus ikut ditukar agar tidak tertukar milik orang lain
                    String tempNama = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempNama;
                }
            }
        }
    }

    // Fungsi pembantu untuk menampilkan data produk dalam bentuk daftar rapi
    public static void tampilkanData(String[] nama, int[] harga) {
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " -> Rp " + harga[i]);
        }
    }
}


