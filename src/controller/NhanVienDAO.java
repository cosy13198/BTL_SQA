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
import model.NhanVien;

/**
 *
 * @author ADM
 */
public class NhanVienDAO extends DAO{

    public NhanVienDAO() {
        getInstance();
    }
    
    public ArrayList<NhanVien> getTenNV(int maPhongGD) {
        ArrayList<NhanVien> maNVList = new ArrayList<NhanVien>();
        try {
            String query = "SELECT HoTen FROM nhan_vien WHERE MaPhongGiaoDich = " + maPhongGD;
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setHoTen(rs.getString("HoTen"));
                maNVList.add(nv);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maNVList;
    }
}
