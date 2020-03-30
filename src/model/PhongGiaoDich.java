/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADM
 */
public class PhongGiaoDich {
    private int MaPhongGiaoDich;
    private String TenPhong;
    private String DiaChi;
    private String DienThoai;

    public PhongGiaoDich() {
    }

    public PhongGiaoDich(int MaPhongGiaoDich, String TenPhong, String DiaChi, String DienThoai) {
        this.MaPhongGiaoDich = MaPhongGiaoDich;
        this.TenPhong = TenPhong;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
    }

    public int getMaPhongGiaoDich() {
        return MaPhongGiaoDich;
    }

    public void setMaPhongGiaoDich(int MaPhongGiaoDich) {
        this.MaPhongGiaoDich = MaPhongGiaoDich;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    @Override
    public String toString() {
        return "PhongGiaoDich{" + "MaPhongGiaoDich=" + MaPhongGiaoDich + ", TenPhong=" + TenPhong + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + '}';
    }
    
}
