/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */
public class Guest {
    String Guest_ID, Nama_Lengkap, Alamat, Jenis_Kelamin, No_KTP, Email, No_Telp;

    public Guest(String Guest_ID, String Nama_Lengkap, String Alamat, String Jenis_Kelamin, String No_KTP, String Email, String No_Telp) {
        this.Guest_ID = Guest_ID;
        this.Nama_Lengkap = Nama_Lengkap;
        this.Alamat = Alamat;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.No_KTP = No_KTP;
        this.Email = Email;
        this.No_Telp = No_Telp;
    }

    public String getGuest_ID() {
        return Guest_ID;
    }

    public void setGuest_ID(String Guest_ID) {
        this.Guest_ID = Guest_ID;
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
