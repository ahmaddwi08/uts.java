/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsmester2;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
public class JawabanSoalNomor5 { 
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
        public static void main(String[] args) {
        String[] namaAsal = {"Dwi", "Budi", "Andre", "Siska", "Azka"};
        
        System.out.println("=== ANALISIS ALGORITMA SORTING MAHASISWA ==="); 
        System.out.println("Data Awal Master : " + Arrays.toString(namaAsal));
        System.out.println("------------------------------------------------");

        // a. Bubble Sort
        String[] dataBubble = namaAsal.clone();
        bubbleSort(dataBubble);
        System.out.println("[a]Hasil Bubble Sort: " + Arrays.toString(dataBubble));

        // b. Selection Sort
        String[] dataSelection = namaAsal.clone();
        selectionSort(dataSelection);
        System.out.println("[b]Hasil Selection Sort: " + Arrays.toString(dataSelection));

        // c. Insertion Sort
        String[] dataInsertion = namaAsal.clone();
        insertionSort(dataInsertion);
        System.out.println("[c]Hasil Insertion Sort: " + Arrays.toString(dataInsertion));
    }
}
 
 