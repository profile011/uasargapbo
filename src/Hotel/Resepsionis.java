/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */
public class Resepsionis {
    String ID_Resepsionis, Nama_Lengkap, Alamat, Jenis_Kelamin, No_KTP, Email, No_Telp;

    public Resepsionis(String ID_Resepsionis, String Nama_Lengkap, String Alamat, String Jenis_Kelamin, String No_KTP, String Email, String No_Telp) {
        this.ID_Resepsionis = ID_Resepsionis;
        this.Nama_Lengkap = Nama_Lengkap;
        this.Alamat = Alamat;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.No_KTP = No_KTP;
        this.Email = Email;
        this.No_Telp = No_Telp;
    }

    public String getID_Resepsionis() {
        return ID_Resepsionis;
    }

    public void setID_Resepsionis(String ID_Resepsionis) {
        this.ID_Resepsionis = ID_Resepsionis;
    }

    public String getNama_Lengkap() {
        return Nama_Lengkap;
    }

    public void setNama_Lengkap(String Nama_Lengkap) {
        this.Nama_Lengkap = Nama_Lengkap;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getJenis_Kelamin() {
        return Jenis_Kelamin;
    }

    public void setJenis_Kelamin(String Jenis_Kelamin) {
        this.Jenis_Kelamin = Jenis_Kelamin;
    }

    public String getNo_KTP() {
        return No_KTP;
    }

    public void setNo_KTP(String No_KTP) {
        this.No_KTP = No_KTP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }
    
    
}
