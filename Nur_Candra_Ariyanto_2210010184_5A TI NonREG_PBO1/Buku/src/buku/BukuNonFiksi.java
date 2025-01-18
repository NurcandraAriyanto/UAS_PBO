/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author user
 */
public class BukuNonFiksi extends Buku {
    private String bidang;

     // Konstruktor
    public BukuNonFiksi(String judul, String penulis, int tahun, boolean tersedia, String bidang) {
        super(judul, penulis, tahun, tersedia);
        this.bidang = bidang;
    }

    // Accessor dan Mutator untuk bidang
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

      // Polimorfisme: Mengoverride metode tampilkanInfoBuku
    @Override
    public void tampilkanInfoBuku() {
        super.tampilkanInfoBuku();
        System.out.println("Bidang: " + bidang);
    }
}
