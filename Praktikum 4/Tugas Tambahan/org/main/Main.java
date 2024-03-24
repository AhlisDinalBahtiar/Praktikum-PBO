/* File         : Main.java
 * Penulis      : Ahlis Dinal Bahtiar
 * Tanggal      : 19 Maret 2024
 * Deskripsi    : Driver class untuk orang, mahasiswa, dan wali mahasiswa
 */
package org.main;

import org.walimahasiswa.*;
import org.mahasiswa.*;

public class Main {
    public static void main(String[] args){
        // Data Wali Mahasiswa
        WaliMahasiswa wli1 = new WaliMahasiswa("Sandy", "12345", "081259092342", "Gondang Barat");
        WaliMahasiswa wli2 = new WaliMahasiswa("Edy", "12346", "081234548532", "Gondang Selatan");
        WaliMahasiswa wli3 = new WaliMahasiswa("Eko", "12347", "081234216542", "Gondang Timur");
        
        // Data Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Ahlis", "12345", "24060122130088", "Informatika", wli1);
        Mahasiswa mhs2 = new Mahasiswa("Dinal", "12346", "24060122130089", "Informatika", wli2);
        Mahasiswa mhs3 = new Mahasiswa("Bahtiar", "12347", "24060122130090", "Informatika", wli3);

        mhs1.cetak();
        mhs2.cetak();
        mhs3.cetak();
    }
}
