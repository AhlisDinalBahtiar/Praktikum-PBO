// Nama : Ahlis Dinal Bahtiar
// NIM : 24060122130088

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        K.gerak();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}