// Nama : Ahlis Dinal Bahtiar
// NIM : 24060122130088
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program class Mahasiswa

public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String Jurusan;
    private WaliMahasiswa Wali;

    public Mahasiswa(String Nama, String NIM, String Jurusan, WaliMahasiswa Wali) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.Wali = Wali;
    }

    public String getNama() {
        return Nama;
    }

    public String getNim() {
        return NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public WaliMahasiswa getWali() {
        return Wali;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNim(String NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public void setWali(WaliMahasiswa Wali) {
        this.Wali = Wali;
    }

    public void cetak() {
        System.out.println("Nama mahasiswa : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("Nama wali : " + Wali.getNama());
        System.out.println("Nomor HP wali : " + Wali.getNomorHp());
        System.out.println("Alamat wali : " + Wali.getAlamat());
    }
}