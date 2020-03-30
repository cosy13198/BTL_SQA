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
public class LoaiTietKiem {
    private int maLoaiTK;
    private String TenLoaiTietKiem;

    public LoaiTietKiem() {
    }

    public LoaiTietKiem(int maLoaiTK, String TenLoaiTietKiem) {
        this.maLoaiTK = maLoaiTK;
        this.TenLoaiTietKiem = TenLoaiTietKiem;
    }

    public String getTenLoaiTietKiem() {
        return TenLoaiTietKiem;
    }

    public void setTenLoaiTietKiem(String TenLoaiTietKiem) {
        this.TenLoaiTietKiem = TenLoaiTietKiem;
    }

    public int getMaLoaiTK() {
        return maLoaiTK;
    }

    public void setMaLoaiTK(int maLoaiTK) {
        this.maLoaiTK = maLoaiTK;
    }

    @Override
    public String toString() {
        return "LoaiTietKiem{" + "maLoaiTK=" + maLoaiTK + ", TenLoaiTietKiem=" + TenLoaiTietKiem + '}';
    }
    
    
}
