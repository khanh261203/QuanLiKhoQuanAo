/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATAACCESSOR.Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Quan extends SanPham{
    private int size;
    private String loaiVai;
    private SanPham sp;
    public Quan(SanPham sp, int size, String loaiVai) {
        this.sp=sp;
        this.size = size;
        this.loaiVai=loaiVai;
    }


    public int getSize() {
        return size;
    }

    public String getLoaiVai() {
        return loaiVai;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLoaiVai(String loaiVai) {
        this.loaiVai = loaiVai;
    }

  public String printQuan(){
         return sp.PrintlnSanPham() + "="+this.size+"="+ this.loaiVai;
    }

    
}