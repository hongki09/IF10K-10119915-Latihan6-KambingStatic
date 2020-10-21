/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119915.latihan6.kambingstatic;

/**
 *
 * @author 
 * Nama      : M Hongki Alfikram
 * NIM       : 10119915
 * Kelas     : IF-10K
 * Deskripsi : Implementasi Variabel 2 class.
 */
public class IF10K10119915Latihan6KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        IF10K10119915Latihan6Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + IF10K10119915Latihan6Mamalia.jumlahKambing);
    }    
}
