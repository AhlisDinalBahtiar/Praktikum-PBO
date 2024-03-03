// Nama : Ahlis Dinal Bahtiar
// NIM : 24060122130088
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Mahasiswa dan WaliMahasiswa

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Pak Sandy", "08123213131", "Jl. Tirto Agung No. 20");
        Mahasiswa mhs1 = new Mahasiswa("Ahlis Dinal Bahtiar", "24060122130088", "Informatika", wali1);

        mhs1.cetak();
    }
}