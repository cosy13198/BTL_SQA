/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SoTietKiem;

/**
 *
 * @author ADM
 */
public class SoTietKiemDAO extends DAO{

    public SoTietKiemDAO() {
        getInstance();
    }
    
    public void luuSoTK(SoTietKiem stk) {    
        try {
            String query = "INSERT INTO so_tiet_kiem (MaKhachHang, SoTienGui, MaLoaiTietKiem, "
                    + "KyHan, LaiSuat, NgayHieuLuc, NgayHetHieuLuc) "
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, stk.getKh().getMaKH());
            ps.setInt(2, stk.getSoTienGui());
            ps.setInt(3, stk.getLoaitk().getMaLoaiTK());
            ps.setString(4, stk.getKyHan());
            ps.setDouble(5, stk.getLaiSuat());
            ps.setString(6, stk.getNgayHieuLuc());
            ps.setString(7, stk.getNgayHetHieuLuc());      
            ps.executeUpdate();
            
            System.out.println("Add saving-book to DB success!!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
