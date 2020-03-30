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
public class QuayGiaoDich {
    private int maQuayGD;
    private String TenQuayGiaoDich;
    private int maPhongGD;

    public QuayGiaoDich() {
    }

    public QuayGiaoDich(int maQuayGD, String TenQuayGiaoDich, int maPhongGD) {
        this.maQuayGD = maQuayGD;
        this.TenQuayGiaoDich = TenQuayGiaoDich;
        this.maPhongGD = maPhongGD;
    }

    public int getMaQuayGD() {
        return maQuayGD;
    }

    public void setMaQuayGD(int maQuayGD) {
        this.maQuayGD = maQuayGD;
    }

    public int getMaPhongGD() {
        return maPhongGD;
    }

    public void setMaPhongGD(int maPhongGD) {
        this.maPhongGD = maPhongGD;
    }

    public String getTenQuayGiaoDich() {
        return TenQuayGiaoDich;
    }

    public void setTenQuayGiaoDich(String TenQuayGiaoDich) {
        this.TenQuayGiaoDich = TenQuayGiaoDich;
    }

    @Override
    public String toString() {
        return "QuayGiaoDich{" + "maQuayGD=" + maQuayGD + ", TenQuayGiaoDich=" + TenQuayGiaoDich + ", maPhongGD=" + maPhongGD + '}';
    }
}
