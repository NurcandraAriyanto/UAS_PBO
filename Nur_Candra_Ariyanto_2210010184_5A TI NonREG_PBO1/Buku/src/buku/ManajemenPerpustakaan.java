/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;
// ManajemenPerpustakaan.java
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ManajemenPerpustakaan {
    public static void main(String[] args) {
         // ArrayList untuk menyimpan daftar buku
        ArrayList<Buku> bukuList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa buku ke dalam daftar
        bukuList.add(new BukuFiksi("Harry Potter", "J.K. Rowling", 1997, true, "Fantasi"));
        bukuList.add(new BukuNonFiksi("Sapiens", "Yuval Noah Harari", 2011, true, "Sejarah"));

        boolean berjalan = true;
        while (berjalan) {
            // Menu utama
            System.out.println("Menu:");
            System.out.println("1. Lihat semua buku");
            System.out.println("2. Tambah buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membuang newline

             // Seleksi: Struktur kontrol switch
            switch (pilihan) {
                case 1:
                    // Perulangan untuk menampilkan semua buku
                    for (Buku buku : bukuList) {
                        buku.tampilkanInfoBuku();
                        System.out.println();
                    }
                    break;
                case 2:
                    try {
                        // I/O sederhana: Input dari pengguna
                        System.out.print("Judul: ");
                        String judul = scanner.nextLine();
                        System.out.print("Penulis: ");
                        String penulis = scanner.nextLine();
                        System.out.print("Tahun: ");
                        int tahun = scanner.nextInt();
                        System.out.print("Tersedia (true/false): ");
                        boolean tersedia = scanner.nextBoolean();
                        scanner.nextLine();  // Membuang newline

                        System.out.print("Jenis buku (1: Fiksi, 2: Non-Fiksi): ");
                        int jenis = scanner.nextInt();
                        scanner.nextLine();  // Membuang newline

                        // Seleksi: Memilih jenis buku
                        if (jenis == 1) {
                            System.out.print("Genre: ");
                            String genre = scanner.nextLine();
                            bukuList.add(new BukuFiksi(judul, penulis, tahun, tersedia, genre));
                        } else if (jenis == 2) {
                            System.out.print("Bidang: ");
                            String bidang = scanner.nextLine();
                            bukuList.add(new BukuNonFiksi(judul, penulis, tahun, tersedia, bidang));
                        } else {
                            System.out.println("Jenis buku tidak valid.");
                        }
                    } catch (Exception e) {
                        // Error handling: Menangani kesalahan input
                        System.out.println("Terjadi kesalahan: " + e.getMessage());
                        scanner.nextLine();  // Membuang input yang tidak valid
                    }
                    break;
                case 3:
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
