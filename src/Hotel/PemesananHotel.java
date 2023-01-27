/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.util.Date;

/**
 *
 * @author User
 */
public class PemesananHotel {
    String ID_Transaksi;
    Date Date;
    String Nama_Lengkap, Alamat, No_KTP, Email;
    Date Check_In, Check_Out;
    int Jumlah_Kamar, Tipe_Kamar;
    String Keterangan;

    public PemesananHotel(String ID_Transaksi, Date Date, String Nama_Lengkap, String Alamat, String No_KTP, String Email, Date Check_In, Date Check_Out, int Jumlah_Kamar, int Tipe_Kamar, String Keterangan) {
        this.ID_Transaksi = ID_Transaksi;
        this.Date = Date;
        this.Nama_Lengkap = Nama_Lengkap;
        this.Alamat = Alamat;
        this.No_KTP = No_KTP;
        this.Email = Email;
        this.Check_In = Check_In;
        this.Check_Out = Check_Out;
        this.Jumlah_Kamar = Jumlah_Kamar;
        this.Tipe_Kamar = Tipe_Kamar;
        this.Keterangan = Keterangan;
    }

    public String getID_Transaksi() {
        return ID_Transaksi;
    }

    public void setID_Transaksi(String ID_Transaksi) {
        this.ID_Transaksi = ID_Transaksi;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
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

    public Date getCheck_In() {
        return Check_In;
    }

    public void setCheck_In(Date Check_In) {
        this.Check_In = Check_In;
    }

    public Date getCheck_Out() {
        return Check_Out;
    }

    public void setCheck_Out(Date Check_Out) {
        this.Check_Out = Check_Out;
    }

    public int getJumlah_Kamar() {
        return Jumlah_Kamar;
    }

    public void setJumlah_Kamar(int Jumlah_Kamar) {
        this.Jumlah_Kamar = Jumlah_Kamar;
    }

    public int getTipe_Kamar() {
        return Tipe_Kamar;
    }

    public void setTipe_Kamar(int Tipe_Kamar) {
        this.Tipe_Kamar = Tipe_Kamar;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
    
}
