/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.io.File;

/**
 *
 * @author User
 */
public class RoomTipe {
    String Type_Room_ID, Room_Type_Name;
    File Gambar;

    public RoomTipe(String Type_Room_ID, String Room_Type_Name, File Gambar) {
        this.Type_Room_ID = Type_Room_ID;
        this.Room_Type_Name = Room_Type_Name;
        this.Gambar = Gambar;
    }

    public String getType_Room_ID() {
        return Type_Room_ID;
    }

    public void setType_Room_ID(String Type_Room_ID) {
        this.Type_Room_ID = Type_Room_ID;
    }

    public String getRoom_Type_Name() {
        return Room_Type_Name;
    }

    public void setRoom_Type_Name(String Room_Type_Name) {
        this.Room_Type_Name = Room_Type_Name;
    }

    public File getGambar() {
        return Gambar;
    }

    public void setGambar(File Gambar) {
        this.Gambar = Gambar;
    }
    
}
