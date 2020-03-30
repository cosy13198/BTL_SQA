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
import model.PhongGiaoDich;

/**
 *
 * @author ADM
 */
public class PhongGiaoDichDAO extends DAO{

    public PhongGiaoDichDAO() {
        getInstance();
    }
    
    public ArrayList<PhongGiaoDich> getPhongGD() {
        ArrayList<PhongGiaoDich> phongGdList = new ArrayList<PhongGiaoDich>();
        try {
            String query = "SELECT TenPhong, MaPhongGiaoDich FROM phong_giao_dich";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhongGiaoDich phonggd = new PhongGiaoDich();
                phonggd.setMaPhongGiaoDich(rs.getInt("MaPhongGiaoDich"));
                phonggd.setTenPhong(rs.getString("TenPhong"));
                phongGdList.add(phonggd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return phongGdList;
    }
    
    public int maPhongGD (String tenPhongGD) {
        int ma = 0;
        try {
            String query = "SELECT MaPhongGiaoDich FROM phong_giao_dich WHERE TenPhongGiaoDich = '" + tenPhongGD + "'";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ma = rs.getInt("MaPhongGiaoDich");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongGiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ma;
    }
}
