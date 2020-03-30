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
public class SoTietKiem {
    private int maSoTietKiem;
    private KhachHang kh;
    private int soTienGui;
    private LoaiTietKiem loaitk;
    private String kyHan;
    private double laiSuat;
    private String ngayHieuLuc;
    private String ngayHetHieuLuc;

    public SoTietKiem() {
    }

    public SoTietKiem(int maSoTietKiem, KhachHang kh, int soTienGui, LoaiTietKiem loaitk, String kyHan, double laiSuat, String ngayHieuLuc, String ngayHetHieuLuc) {
        this.maSoTietKiem = maSoTietKiem;
        this.kh = kh;
        this.soTienGui = soTienGui;
        this.loaitk = loaitk;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.ngayHieuLuc = ngayHieuLuc;
        this.ngayHetHieuLuc = ngayHetHieuLuc;
    }

    public int getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(int maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public LoaiTietKiem getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(LoaiTietKiem loaitk) {
        this.loaitk = loaitk;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getNgayHieuLuc() {
        return ngayHieuLuc;
    }

    public void setNgayHieuLuc(String ngayHieuLuc) {
        this.ngayHieuLuc = ngayHieuLuc;
    }

    public String getNgayHetHieuLuc() {
        return ngayHetHieuLuc;
    }

    public void setNgayHetHieuLuc(String ngayHetHieuLuc) {
        this.ngayHetHieuLuc = ngayHetHieuLuc;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" + "maSoTietKiem=" + maSoTietKiem + ", kh=" + kh + ", soTienGui=" + soTienGui + ", loaitk=" + loaitk + ", kyHan=" + kyHan + ", laiSuat=" + laiSuat + ", ngayHieuLuc=" + ngayHieuLuc + ", ngayHetHieuLuc=" + ngayHetHieuLuc + '}';
    }
    
}
