# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul,penulis,tahun,tersedia, dan memberikan output berupa informasi detail dari tiap atribut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `BukuFiksi`, `BukuNonFiksi`, dan 'ManajemenPerpustakaan' adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class BukuFiksi extends Buku {
    ...
}

public class BukuNonFiksi extends Buku {
    ...
}
```

public class ManajemenPerpustakaan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `BukuFiksi(String judul, String penulis, int tahun, boolean tersedia, String genre);` adalah contoh pembuatan object dan satunya adalah NonFiksi Hanya mengganti nama.

```bash
bukuList.add(new BukuFiksi("Harry Potter", "J.K. Rowling", 1997, true, "Fantasi"));
bukuList.add(new BukuNonFiksi("Sapiens", "Yuval Noah Harari", 2011, true, "Sejarah"));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, 'penulis', 'tahun' dan `tersedia` adalah contoh atribut.

```bash
String judul;
String penulis;
int tahun;
boolean tersedia;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku`, `BukuFiksi`, dan `BukuNonFiksi`.

```bash
    public Buku(String judul, String penulis, int tahun, boolean tersedia) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.tersedia = tersedia;
    }

 public BukuFiksi(String judul, String penulis, int tahun, boolean tersedia, String genre) {
        super(judul, penulis, tahun, tersedia);
        this.genre = genre;
    }

    public BukuNonFiksi(String judul, String penulis, int tahun, boolean tersedia, String bidang) {
        super(judul, penulis, tahun, tersedia);
        this.bidang = bidang;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul` dan `setPenulis` adalah contoh method mutator.

```bash
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`dan `getPenulis`, adalah contoh method accessor.

```bash
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul`, 'penulis', 'tahun' dan `tersedia` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String judul;
    private String penulis;
    private int tahun;
    private boolean tersedia;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BukuFiksi` dan 'BukuNonFiksi' mewarisi `Buku` dengan sintaks `extends`.

```bash
public class BukuFiksi extends Buku {
    ...
}

public class BukuNonFiksi extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method Saya tidak tau tapi berhasil jalan BukuFiksi dan BukuNonFiksi.

```bash
    @Override
    public void tampilkanInfoBuku() {
        super.tampilkanInfoBuku();
        System.out.println("Genre: " + genre);
    }

    @Override
    public void tampilkanInfoBuku() {
        super.tampilkanInfoBuku();
        System.out.println("Bidang: " + bidang);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getBidang` dan seleksi `switch` dalam method `Pilihan`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Buku buku : bukuList) {
                        buku.tampilkanInfoBuku();
                        System.out.println();
                    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
 ArrayList<Buku> bukuList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
                        // Error handling: Menangani kesalahan input
                        System.out.println("Terjadi kesalahan: " + e.getMessage());
                        scanner.nextLine();  // Membuang input yang tidak valid
                    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Kamaluddin Iqbal
NPM: 2110010622
