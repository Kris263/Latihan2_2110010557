/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampus;

/**
 *
 * @author krist
 */
public class DosenBeraksi {
    public static void main(String[] args) {
        Dosen kristian = new Dosen ("1234567 ", " Agus S.Pd ", " IPS ");
        
        System.out.println("Detail Dosen");
        System.out.println("NIDN = "+kristian.getNidn());
        System.out.println("Nama = "+kristian.getNama());
        System.out.println("Mata Kuliah = "+kristian.getMataKuliah());
    }
}
