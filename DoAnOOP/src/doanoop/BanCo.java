/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop;

import java.awt.Graphics;

/**
 *
 * @author Ling
 */
public class BanCo {
    int _SoDong;
    int _SoCot;
    
    public BanCo()
    {
        _SoDong = 0;
        _SoCot = 0;
    }
    public BanCo(int SoDong, int SoCot)
    {
        this._SoDong = SoDong;
        this._SoCot = SoCot;
    }
    public void VeBanCo(Graphics g)
    {
        for (int i = 0; i <= this._SoCot;i++)
        {
            g.drawLine(i, i, i, i);
        }
    }
}
