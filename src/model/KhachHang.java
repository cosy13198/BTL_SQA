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
public class KhachHang {
    private int maKH;
    private String hoTen;
    private String cmnd;
    private String ngayCap;
    private String noiCap;
    private String diaChi;
    private String sdt;

    public KhachHang(int maKH, String hoTen, String cmnd, String ngayCap, String noiCap, String diaChi, String sdt) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.cmnd = cmnd;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public KhachHang() {
    }
    
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
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

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", cmnd=" + cmnd + ", ngayCap=" + ngayCap + ", noiCap=" + noiCap + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }
    
}
