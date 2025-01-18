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
// Buku.java
public class Buku {
    // Atribut
    private String judul;
    private String penulis;
    private int tahun;
    private boolean tersedia;

    // Konstruktor
    public Buku(String judul, String penulis, int tahun, boolean tersedia) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.tersedia = tersedia;
    }

    // Mutator (Setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Accessor (Getter)
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahun);
        System.out.println("Tersedia: " + tersedia);
    }
}

