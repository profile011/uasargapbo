/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */
public class Room {
    String Room_ID, Nama_Kamar, Deskripsi;
    int Harga_Kamar;
    String Tipe_Kamar;

    public Room(String Room_ID, String Nama_Kamar, String Deskripsi, int Harga_Kamar, String Tipe_Kamar) {
        this.Room_ID = Room_ID;
        this.Nama_Kamar = Nama_Kamar;
        this.Deskripsi = Deskripsi;
        this.Harga_Kamar = Harga_Kamar;
        this.Tipe_Kamar = Tipe_Kamar;
    }

    public String getRoom_ID() {
        return Room_ID;
    }

    public void setRoom_ID(String Room_ID) {
        this.Room_ID = Room_ID;
    }

    public String getNama_Kamar() {
        return Nama_Kamar;
    }

    public void setNama_Kamar(String Nama_Kamar) {
        this.Nama_Kamar = Nama_Kamar;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public int getHarga_Kamar() {
        return Harga_Kamar;
    }

    public void setHarga_Kamar(int Harga_Kamar) {
        this.Harga_Kamar = Harga_Kamar;
    }

    public String getTipe_Kamar() {
        return Tipe_Kamar;
    }

    public void setTipe_Kamar(String Tipe_Kamar) {
        this.Tipe_Kamar = Tipe_Kamar;
    }
    
}
