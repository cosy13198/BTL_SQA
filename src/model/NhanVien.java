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
public class NhanVien {
    private int maNV;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String sdt;
    private int maPhongGiaoDich;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoTen, String ngaySinh, String diaChi, String sdt, int maPhongGiaoDich) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.maPhongGiaoDich = maPhongGiaoDich;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getMaPhongGiaoDich() {
        return maPhongGiaoDich;
    }

    public void setMaPhongGiaoDich(int maPhongGiaoDich) {
        this.maPhongGiaoDich = maPhongGiaoDich;
    }
    
}
