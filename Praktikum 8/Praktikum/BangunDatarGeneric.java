public class BangunDatarGeneric<T extends BangunDatar>{
    private T  bangunDatar;

    public void set (T bangunDatar){
        this.bangunDatar = bangunDatar;
    }

    public T get (){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}