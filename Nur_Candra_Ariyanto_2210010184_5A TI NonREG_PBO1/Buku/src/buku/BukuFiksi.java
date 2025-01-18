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
public class BukuFiksi extends Buku {
    private String genre;

    //Konstruktor
    public BukuFiksi(String judul, String penulis, int tahun, boolean tersedia, String genre) {
        super(judul, penulis, tahun, tersedia);
        this.genre = genre;
    }

    // Accessor dan Mutator untuk genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Polimorfisme: Mengoverride metode tampilkanInfoBuku
    @Override
    public void tampilkanInfoBuku() {
        super.tampilkanInfoBuku();
        System.out.println("Genre: " + genre);
    }
}

