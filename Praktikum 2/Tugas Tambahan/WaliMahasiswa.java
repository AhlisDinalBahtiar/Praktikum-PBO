// Nama : Ahlis Dinal Bahtiar
// NIM : 24060122130088
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program class WaliMahasiswa

public class WaliMahasiswa {
    private String Nama;
    private String NomorHP;
    private String Alamat;

    public WaliMahasiswa(String Nama, String NomorHP, String Alamat) {
        this.Nama = Nama;
        this.NomorHP = NomorHP;
        this.Alamat = Alamat;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomorHp() {
        return NomorHP;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNomorHp(String NomorHP) {
        this.NomorHP = NomorHP;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
}