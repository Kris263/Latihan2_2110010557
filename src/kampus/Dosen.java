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
public class Dosen {
    String nidn, nama, mataKuliah;
    
    public String getDetail() {
        return nidn + nama + mataKuliah;
    }
    
    public Dosen (String nidn, String nama, String mataKuliah) {
        this.nidn = nidn;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }
    
    
}
