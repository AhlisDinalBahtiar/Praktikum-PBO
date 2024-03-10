// Nama : Ahlis Dinal Bahtiar
// NIM : 24060122130088
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program class Main

public class Main {
    public static void main(String[] args) {
        Anggota member1 = new Anggota("Ahlis Dinal Bahtiar");
        Anggota member2 = new Anggota("Joko Widodo");
        Buku buku1 = new Buku("Maling Kundang");
        Buku buku2 = new Buku("Rahasia Bumi");
        Buku buku3 = new Buku("Exhuma");

        try {
            member1.pinjamBuku(buku1);
            member1.pinjamBuku(buku2);
            member1.pinjamBuku(buku3);
            member1.pinjamBuku(new Buku("Dilan 1990"));
            member2.pinjamBuku(buku1);
            member2.pinjamBuku(buku2);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
