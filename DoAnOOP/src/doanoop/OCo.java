/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop;

import java.awt.Point;

/**
 *
 * @author Ling
 */
public class OCo {
    public static final int _ChieuRong = 25;
    public static final int _ChieuCao = 25;
    
    int _Dong;
    int _Cot;
    Point _ViTri;
    int _SoHuu;
    public void setDong(int Dong)
    {
        this._Dong = Dong;
    }
    public int getDong()
    {
        return this._Dong;
    }
    public void setCot(int Cot)
    {
        this._Cot = Cot;
    }
    public int getCot()
    {
        return this._Cot;
    }
    public void setViTri(Point ViTri)
    {
        this._ViTri = ViTri;
    }
    public Point getPoint()
    {
        return this._ViTri;
    }
    public void setSoHuu(int SoHuu)
    {
        this._SoHuu = SoHuu;
    }
    public int getSoHuu()
    {
        return this._SoHuu;
    }
}
