/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuce.cntt.oop.th1.bai1.accessory;

/**
 *
 * @author Thai
 */
public class Book {

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    String ten;
    String tacgia;
    int sotrang;
    String kichthuoc;
    Book(){
    }
    Book(String ten, String tacgia, int sotrang, String kichthuoc)
    {
        this.ten = ten;
        this.tacgia = tacgia;
        this.sotrang = sotrang;
        this.kichthuoc = kichthuoc;
    }
}
