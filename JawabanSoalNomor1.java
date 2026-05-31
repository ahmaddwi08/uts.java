/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsmester2;

/**
 *
 * @author LENOVO
 */
public class JawabanSoalNomor1 {
    public static void main(String[] args) {
        int[][] kursi = new int[5][5];
        int KursiKosong = 0;
        int KursiTerisi = 0;
        
        // 1. Menampilkan denah yang belum diisi
        System.out.println("~~~denah yang belum di isi~~~");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(kursi[i][j] + " ");
                
                // Menghitung kondisi awal
                if (kursi[i][j] == 0) {
                    KursiKosong++;
                } else if (kursi[i][j] == 1) {
                    KursiTerisi++;
                }
            }
            System.out.println();
        }
       
        System.out.println("Jumlah Kursi Kosong : " + KursiKosong);
        System.out.println("Jumlah Kursi Terisi : " + KursiTerisi);
        System.out.println();
        
        // 2. Proses pengisian kursi (Pemesanan)
        kursi[0][0] = 1;
        kursi[1][1] = 1;
        kursi[2][2] = 1;
        kursi[3][3] = 1;
        kursi[4][4] = 1;
        kursi[0][4] = 1;
        kursi[1][1] = 1;
        kursi[1][2] = 1;
        kursi[3][1] = 1;
        kursi[1][3] = 1;
        kursi[4][0] = 1;
        kursi[3][2] = 1;
        
        // 3. Menampilkan Denah yang sudah diisi
        System.out.println("~~~Denah yang sudah di isi~~~");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println();
        }
        //variabel yang di gunakan untuk meriset perhitungan kursi pertaman
        KursiKosong = 0;
        KursiTerisi = 0;
        
        // 4. Penghitungan ulang kursi kosong dan kursi terisi
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (kursi[i][j] == 0) {
                    KursiKosong++;
                } else if (kursi[i][j] == 1) {
                    KursiTerisi++;
                }
            }
        }
                         
        System.out.println("Jumlah Kursi Kosong : " + KursiKosong);
        System.out.println("Jumlah Kursi Terisi : " + KursiTerisi);
    }
}