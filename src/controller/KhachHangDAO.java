/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.glass.ui.SystemClipboard;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;

/**
 *
 * @author ADM
 */
public class KhachHangDAO extends DAO{

    public KhachHangDAO() {
        getInstance();
    }
    
    public void luuKH(KhachHang kh) {
        try {
            String query = "INSERT INTO khach_hang (HoTen, CMND, NgayCap, NoiCap, DiaChi, SDT) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, kh.getHoTen());
            ps.setString(2, kh.getCmnd());
            ps.setString(3, kh.getNgayCap());
            ps.setString(4, kh.getNoiCap());
            ps.setString(5, kh.getDiaChi());
            ps.setString(6, kh.getSdt());
            ps.executeUpdate();
            System.out.println("Add customer to DB success!!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public int getMaKH(String cmnd) {
        int maKH = 0;
        try {
            String query = "SELECT * FROM khach_hang WHERE CMND = '" + cmnd +"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maKH = rs.getInt("MaKhachHang");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maKH;
    }
    public int getMaKH2(String tenKH) {
        int maKH = 0;
        try {
            String query = "SELECT MaKhachHang FROM khach_hang WHERE CMND = '" + tenKH +"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maKH = rs.getInt("MaKhachHang");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maKH;
    }
}
