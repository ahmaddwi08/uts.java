/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsmester2;

/**
 *
 * @author LENOVO
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JawabanSoalNomor4 {
   
    public static void main(String[] args) {
        //Untuk menyimpan data pesanan
        Queue<String> antreanPesanan = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("~~~ a. MENAMBAHKAN DATA PESANAN PELANGGAN ~~~");
        
        //Perulangan untuk mengambil 3 inputan pelanggan
        for (int i = 1; i <= 3; i++) {
            System.out.println("Data Pelanggan " + i + ":");
            System.out.print("   Masukkan Nama Pemesan: ");
            String nama = input.nextLine();
            System.out.print("   Masukkan Menu yang Dipesan: ");
            String menu = input.nextLine();

            // Menggabungkan nama dan menu, lalu memasukkannya ke dalam Queue
            String dataPesanan = "Pemesan: " + nama + " -> Menu: " + menu;
            antreanPesanan.add(dataPesanan);
            System.out.println("   [Berhasil dimasukkan ke antrean]\n");
        }

        System.out.println("~~~ b. MENAMPILKAN DAFTAR ANTREAN ~~~");
        tampilkanAntrean(antreanPesanan);
        System.out.println();

        System.out.println("~~~ c. MEMPROSES PESANAN PERTAMA ~~~");
        // Mengambil dan menghapus pesanan yang berada di paling depan antrean
        if (!antreanPesanan.isEmpty()) {
            String pesananDiproses = antreanPesanan.poll();
            System.out.println("Sedang diproses -> " + pesananDiproses);
            System.out.println("Selesai! Pesanan telah diserahkan kepada pelanggan.");
        } else {
            System.out.println("Antrean kosong.");
        }
        System.out.println();

        System.out.println("~~~ d. MENAMPILKAN ANTREAN SETELAH PROSES PELAYANAN ~~~");
        tampilkanAntrean(antreanPesanan);

        input.close(); // Menutup scanner
    }

    // Fungsi pembantu untuk menampilkan daftar antrean
    public static void tampilkanAntrean(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("Daftar Antrean: (Kosong)");
        } else {
            System.out.println("Daftar Antrean Saat Ini (Paling depan ke belakang):");
            int nomor = 1;
            for (String pesanan : queue) {
                System.out.println(nomor + ". " + pesanan);
                nomor++;
            }
            System.out.println("Total antrean tersisa: " + queue.size() + " pesanan.");
        }
    }
}