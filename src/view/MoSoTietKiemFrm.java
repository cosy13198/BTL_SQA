/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.KhachHangDAO;
import controller.LoaiTietKiemDAO;
import controller.NhanVienDAO;
import controller.PhongGiaoDichDAO;
import controller.QuayGiaoDichDAO;
import controller.SoTietKiemDAO;
import java.sql.SQLData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.KhachHang;
import model.LoaiTietKiem;
import model.NhanVien;
import model.PhongGiaoDich;
import model.QuayGiaoDich;
import model.SoTietKiem;

/**
 *
 * @author ADM
 */
public class MoSoTietKiemFrm extends javax.swing.JFrame {

    private KhachHang kh;
    private LoaiTietKiem ltk;
    private PhongGiaoDich phongGD;
    private SoTietKiem stk;
    private KhachHangDAO khDAO;
    private LoaiTietKiemDAO ltkDAO;
    private NhanVienDAO nvDAO;
    private PhongGiaoDichDAO pgdDAO;
    private QuayGiaoDichDAO quaygdDAO;
    private SoTietKiemDAO stkDAO;
    private ArrayList<LoaiTietKiem> ltkList;
    private ArrayList<PhongGiaoDich> pgdList;
    private ArrayList<QuayGiaoDich> quaygdList;
    private ArrayList<NhanVien> nvList;
    
    public MoSoTietKiemFrm(){
        initComponents();
    }
    public MoSoTietKiemFrm(KhachHang kh) {
        initComponents();
        this.kh = kh;
        khDAO = new KhachHangDAO();
        ltkDAO = new LoaiTietKiemDAO();
        nvDAO = new NhanVienDAO();
        pgdDAO = new PhongGiaoDichDAO();
        quaygdDAO = new QuayGiaoDichDAO();
        stkDAO = new SoTietKiemDAO();
        jLabelTenKH.setText(kh.getHoTen());
        kh.setMaKH(khDAO.getMaKH(kh.getCmnd()));
        jLabelMaKH.setText(Integer.toString(kh.getMaKH()));
        fillCbxLoaiTK();
        fillCbxPhongGD();
    }
    private void fillCbxLoaiTK() {
        ltkList = ltkDAO.getLoaiTK();
        for (LoaiTietKiem ltk : ltkList)
            jComboBoxLoaiTietKiem.addItem(ltk.getTenLoaiTietKiem());
    }
    private void fillCbxPhongGD() {
        pgdList = pgdDAO.getPhongGD();
        for (PhongGiaoDich pgd : pgdList)
            jComboBoxPhongGD.addItem(pgd.getTenPhong());
    }
    private void fillCbxQuayGD(int cs) {
        jComboBoxQuayGD.removeAllItems();
        int maPhongGD = pgdList.get(cs).getMaPhongGiaoDich();
        quaygdList = quaygdDAO.getQuayGD(maPhongGD);
        if(quaygdList.size() > 0){
            for (QuayGiaoDich quaygd : quaygdList)
                jComboBoxQuayGD.addItem(quaygd.getTenQuayGiaoDich());
        }
    }
    private void fillCbxTenNV(int cs) {
        jComboBoxTenNV.removeAllItems();
        int maPhongGD = pgdList.get(cs).getMaPhongGiaoDich();
        nvList = nvDAO.getTenNV(maPhongGD);
        if(nvList.size() > 0){
            for (NhanVien nv : nvList) {
                jComboBoxTenNV.addItem(nv.getHoTen());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTenKH = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelMaKH = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSoTienGui = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxLoaiTienGui = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxLoaiTietKiem = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxKyHan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLaisuat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNgayHieuLuc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNgayHetHieuLuc = new javax.swing.JTextField();
        jButtonThemSo = new javax.swing.JButton();
        jButtonNhapLai = new javax.swing.JButton();
        jButtonQuayLai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPhongGD = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxQuayGD = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTenNV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MỞ SỔ TIẾT KIỆM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên khách hàng:");

        jLabelTenKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Mã khách hàng:");

        jLabelMaKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số tiền gửi:");

        jTextFieldSoTienGui.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Loại tiền gửi:");

        jComboBoxLoaiTienGui.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxLoaiTienGui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VND", "EUR", "HKD", "USD" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Loại tiết kiệm:");

        jComboBoxLoaiTietKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Kỳ hạn:");

        jComboBoxKyHan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxKyHan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 tháng", "3 tháng", "6 tháng", "9 tháng", "12 tháng", "15 tháng", "18 tháng", "24 tháng", "36 tháng" }));
        jComboBoxKyHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKyHanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Lãi suất:");

        jTextFieldLaisuat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Ngày hiệu lực:");

        jTextFieldNgayHieuLuc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Ngày hết hiệu lực:");

        jTextFieldNgayHetHieuLuc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButtonThemSo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonThemSo.setText("THÊM SỔ");
        jButtonThemSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemSoActionPerformed(evt);
            }
        });

        jButtonNhapLai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonNhapLai.setText("NHẬP LẠI");
        jButtonNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhapLaiActionPerformed(evt);
            }
        });

        jButtonQuayLai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonQuayLai.setText("QUAY LẠI");
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Phòng giao dịch:");

        jComboBoxPhongGD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxPhongGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPhongGDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quầy giao dịch:");

        jComboBoxQuayGD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxQuayGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQuayGDActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Tên nhân viên:");

        jComboBoxTenNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTenNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButtonThemSo)
                .addGap(151, 151, 151)
                .addComponent(jButtonNhapLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButtonQuayLai)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSoTienGui)
                    .addComponent(jComboBoxLoaiTietKiem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNgayHieuLuc)
                    .addComponent(jComboBoxPhongGD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTenNV, 0, 205, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLoaiTienGui, 0, 207, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxKyHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLaisuat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNgayHetHieuLuc)
                            .addComponent(jComboBoxQuayGD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoTienGui, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLoaiTienGui, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLoaiTietKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxKyHan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLaisuat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNgayHieuLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNgayHetHieuLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPhongGD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxQuayGD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemSo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButtonNhapLai)
                    .addComponent(jButtonQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxKyHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKyHanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKyHanActionPerformed

    private void jButtonThemSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemSoActionPerformed
        // TODO add your handling code here:
        if (jTextFieldSoTienGui.getText().length() > 0 && jTextFieldLaisuat.getText().length() > 0 && 
                jTextFieldNgayHieuLuc.getText().length() > 0 || jTextFieldNgayHetHieuLuc.getText().length() > 0) {
            stk = new SoTietKiem();
            ltk = ltkList.get(jComboBoxLoaiTietKiem.getSelectedIndex());
            int soTienGui = Integer.parseInt(jTextFieldSoTienGui.getText());
            String kyHan = (String) jComboBoxKyHan.getSelectedItem();
            double laiSuat = Double.parseDouble(jTextFieldLaisuat.getText());
            String ngayHieuLuc = jTextFieldNgayHieuLuc.getText();
            String ngayHetHieuLuc = jTextFieldNgayHetHieuLuc.getText();
            stk.setKh(kh);
            stk.setSoTienGui(soTienGui);
            stk.setLoaitk(ltk);
            stk.setKyHan(kyHan);
            stk.setLaiSuat(laiSuat);
            stk.setNgayHieuLuc(ngayHieuLuc);
            stk.setNgayHetHieuLuc(ngayHetHieuLuc);
            stkDAO.luuSoTK(stk);
        }
        else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_jButtonThemSoActionPerformed

    private void jComboBoxPhongGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPhongGDActionPerformed
        // TODO add your handling code here:
        int cs = jComboBoxPhongGD.getSelectedIndex();
        fillCbxQuayGD(cs);
        fillCbxTenNV(cs);
    }//GEN-LAST:event_jComboBoxPhongGDActionPerformed

    private void jComboBoxQuayGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQuayGDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxQuayGDActionPerformed

    private void jComboBoxTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTenNVActionPerformed

    private void jButtonNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhapLaiActionPerformed
        // TODO add your handling code here:
        jTextFieldSoTienGui.setText("");
        jTextFieldLaisuat.setText("");
        jTextFieldNgayHieuLuc.setText("");
        jTextFieldNgayHetHieuLuc.setText("");
    }//GEN-LAST:event_jButtonNhapLaiActionPerformed

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThongTinKhachHangFrm ttkhFrm = new ThongTinKhachHangFrm();
        ttkhFrm.setVisible(true);
        ttkhFrm.setLocationRelativeTo(null);
        ttkhFrm.setTitle("Quản lý sổ tiết kiệm - Vay lãi ngân hàng");
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed
    public static void main(String[] args) {
        MoSoTietKiemFrm mostkFrm = new MoSoTietKiemFrm();
        mostkFrm.setVisible(true);
        mostkFrm.setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNhapLai;
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JButton jButtonThemSo;
    private javax.swing.JComboBox<String> jComboBoxKyHan;
    private javax.swing.JComboBox<String> jComboBoxLoaiTienGui;
    private javax.swing.JComboBox<String> jComboBoxLoaiTietKiem;
    private javax.swing.JComboBox<String> jComboBoxPhongGD;
    private javax.swing.JComboBox<String> jComboBoxQuayGD;
    private javax.swing.JComboBox<String> jComboBoxTenNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMaKH;
    private javax.swing.JLabel jLabelTenKH;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLaisuat;
    private javax.swing.JTextField jTextFieldNgayHetHieuLuc;
    private javax.swing.JTextField jTextFieldNgayHieuLuc;
    private javax.swing.JTextField jTextFieldSoTienGui;
    // End of variables declaration//GEN-END:variables
}
