/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoaiTietKiem;

/**
 *
 * @author ADM
 */
public class LoaiTietKiemDAO extends DAO{

    public LoaiTietKiemDAO() {
        getInstance();
    }
    
    public ArrayList<LoaiTietKiem> getLoaiTK() {
        ArrayList<LoaiTietKiem> ltkList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM loai_tiet_kiem";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiTietKiem loaiTK = new LoaiTietKiem();
                loaiTK.setMaLoaiTK(rs.getInt("MaLoaiTietKiem"));
                loaiTK.setTenLoaiTietKiem(rs.getString("TenLoaiTietKiem"));
                ltkList.add(loaiTK);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ltkList;
    }
    public int getMaLoaiTK(String tenLoaiTK) {
        int maLoaiTK = 0;
        try {
            String query = "SELECT MaLoaiTietKiem FROM loai_tiet_kiem WHERE TenLoaiTietKiem = '" + tenLoaiTK +"'";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maLoaiTK = rs.getInt("MaLoaiTietKiem");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maLoaiTK;
    }
}
