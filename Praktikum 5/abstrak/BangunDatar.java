// BangunDatar.java 23/03/24
// Penulis   : Ahlis Dinal Bahtiar
// NIM       : 24060122130088
// Deskripsi : Kelas abstrak, berisi abstraksi bangun datar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas (double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}

