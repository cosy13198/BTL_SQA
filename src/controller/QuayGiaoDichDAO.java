/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PhongGiaoDich;
import model.QuayGiaoDich;

/**
 *
 * @author ADM
 */
public class QuayGiaoDichDAO extends DAO{

    public QuayGiaoDichDAO() {
        getInstance();
    }
    public ArrayList<QuayGiaoDich> getQuayGD(int maPhongGD) {
        ArrayList<QuayGiaoDich> quayGdList = new ArrayList<QuayGiaoDich>();
        try {
            String query = "SELECT TenQuayGiaoDich FROM quay_giao_dich WHERE MaPhongGiaoDich = " + maPhongGD;
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                QuayGiaoDich quaygd = new QuayGiaoDich();
                quaygd.setTenQuayGiaoDich(rs.getString("TenQuayGiaoDich"));
                quayGdList.add(quaygd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return quayGdList;
    }
}
