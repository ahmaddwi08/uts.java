/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsmester2;

/**
 *
 * @author LENOVO
 */
    import java.util.Stack;
public class JawabanSoalNomor3 {
    public static void main(String[] args) {
        // a. Membuat objek Stack untuk menyimpan aksi pengguna
        Stack<String> riwayatAksi = new Stack<>();
        
        System.out.println("=== PROSES PUSH (Menyimpan Aksi Pengguna) ===");
        
        // b & c. Menyimpan minimal 5 aksi pengguna (Push)
        pushAksi(riwayatAksi, "Menulis teks");
        pushAksi(riwayatAksi, "Menghapus teks kata");
        pushAksi(riwayatAksi, "Mengganti warna teks");
        pushAksi(riwayatAksi, "Menambahkan objek");
        pushAksi(riwayatAksi, "Mengubah ukuran Kotak");
        
        System.out.println("\nIsi Stack saat ini (dari bawah ke atas):");
        System.out.println(riwayatAksi);
        System.out.println("----------------------------------------------");
        // c. Melakukan simulasi Undo beberapa kali (Pop)
        popAksi(riwayatAksi);
   
        System.out.println("\nIsi Stack akhir setelah beberapa kali Undo:");
        System.out.println(riwayatAksi);
    }

    // Fungsi pembantu untuk mempermudah visualisasi Push
    public static void pushAksi(Stack<String> stack, String aksi) {
        stack.push(aksi);
        System.out.println("Push:" + aksi + " ");
    }

    // Fungsi pembantu untuk mempermudah visualisasi Pop (Undo)
    public static void popAksi(Stack<String> stack) {
        System.out.println("\n--- Pengguna menekan tombol UNDO (Ctrl + Z) ---");
        if (!stack.isEmpty()) {
            String aksiDibatalkan = stack.pop();
            System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksiDibatalkan);
        }
        System.out.println("\n--- Pengguna menekan tombol UNDO lagi ---"); 
        if (!stack.isEmpty()) { 
            String aksiDibatalkan = stack.pop();
            System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksiDibatalkan); 
        }
           
    }
}