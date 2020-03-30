/*
 Navicat Premium Data Transfer

 Source Server         : PHUONGNABI
 Source Server Type    : MySQL
 Source Server Version : 100406
 Source Host           : localhost:3306
 Source Schema         : qlstk_test

 Target Server Type    : MySQL
 Target Server Version : 100406
 File Encoding         : 65001

 Date: 30/03/2020 17:56:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for khach_hang
-- ----------------------------
DROP TABLE IF EXISTS `khach_hang`;
CREATE TABLE `khach_hang`  (
  `MaKhachHang` int(10) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `CMND` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `NgayCap` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `NoiCap` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `SDT` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khach_hang
-- ----------------------------
INSERT INTO `khach_hang` VALUES (42, 'phuongnt', '174577345', '', '', '', '');
INSERT INTO `khach_hang` VALUES (43, 'sdsdsdad', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (44, 'chuyentd', '123456789', '', '', '', '');
INSERT INTO `khach_hang` VALUES (45, 'tran duc chuyen', '987654321', '', '', '', '');
INSERT INTO `khach_hang` VALUES (46, 'fdssfssssd', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (47, 'sdsdasd', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (48, 'ngoc', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (49, 'dsdsfhfkjfd', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (50, 'fsfdwewewqe', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (51, 'jhhghuehrhe', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (52, 'nguyen thi phuong', '174577543', '12/11/2015', 'Thanh Hoa', 'Thanh Hoa', '0989671646');
INSERT INTO `khach_hang` VALUES (53, 'tran duc chuyen', '987654321', '10/11/2015', 'Thai Binh', 'Thai Binh', '0398984666');
INSERT INTO `khach_hang` VALUES (54, 'adffgssd', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (55, 'grkheeirwerk', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (56, 'tran hong anh', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (57, 'gfhegteywyeu', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (58, 'treytryerf', '', '', '', '', '');
INSERT INTO `khach_hang` VALUES (59, 'nhat thanh', '174577435', '10/10/2015', 'Thanh Hoa', 'Thanh Hoa', '01234567');
INSERT INTO `khach_hang` VALUES (60, 'nguyen thi trang', '987654321', '', '', '', '');
INSERT INTO `khach_hang` VALUES (61, 'nguyen quang huy', '147258369', '', '', '', '');
INSERT INTO `khach_hang` VALUES (62, 'nguyen van luong', '741852963', '', '', '', '');
INSERT INTO `khach_hang` VALUES (63, 'huy', '1456789', '', '', '', '');
INSERT INTO `khach_hang` VALUES (64, 'nhat thanh', '1234567', '', '', '', '');
INSERT INTO `khach_hang` VALUES (65, 'huyen', '123456', '', '', '', '');
INSERT INTO `khach_hang` VALUES (66, 'hong ngoc', '9874445', '', '', '', '');
INSERT INTO `khach_hang` VALUES (67, 'Nguyen Thi Phuong', '174577345', '12/11/2015', 'Thanh Hoa', 'Thanh Hoa', '0989671646');

-- ----------------------------
-- Table structure for loai_tiet_kiem
-- ----------------------------
DROP TABLE IF EXISTS `loai_tiet_kiem`;
CREATE TABLE `loai_tiet_kiem`  (
  `MaLoaiTietKiem` int(10) NOT NULL,
  `TenLoaiTietKiem` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  INDEX `MaLoaiTietKiem`(`MaLoaiTietKiem`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loai_tiet_kiem
-- ----------------------------
INSERT INTO `loai_tiet_kiem` VALUES (1, 'Tiet kiem muc tieu');
INSERT INTO `loai_tiet_kiem` VALUES (2, 'Tiet kiem ngoai te');

-- ----------------------------
-- Table structure for nhan_vien
-- ----------------------------
DROP TABLE IF EXISTS `nhan_vien`;
CREATE TABLE `nhan_vien`  (
  `MaNV` int(10) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `NgaySinh` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `DiaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `SDT` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `MaPhongGiaoDich` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`MaNV`) USING BTREE,
  INDEX `MaPhongGiaoDich`(`MaPhongGiaoDich`) USING BTREE,
  CONSTRAINT `nhan_vien_ibfk_1` FOREIGN KEY (`MaPhongGiaoDich`) REFERENCES `phong_giao_dich` (`MaPhongGiaoDich`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nhan_vien
-- ----------------------------
INSERT INTO `nhan_vien` VALUES (1, 'Nguyen Thi Phuong', '27/07/1998', 'Thanh Hoa', '0989671646', 1);
INSERT INTO `nhan_vien` VALUES (2, 'Tran Duc Chuyen', '28/02/1997', 'Thai Binh', '0398984666', 2);
INSERT INTO `nhan_vien` VALUES (3, 'Nguyen Thi Hong Ngoc', '11/03/1995', 'Thanh Hoa', '0989206132', 1);
INSERT INTO `nhan_vien` VALUES (4, 'Trinh Thi Chi', '27/10/1996', 'Ha Noi', '0395402250', 3);
INSERT INTO `nhan_vien` VALUES (5, 'Nguyen Huu Lam', '23/07/1994', 'Ha Noi', '0343247150', 4);

-- ----------------------------
-- Table structure for phong_giao_dich
-- ----------------------------
DROP TABLE IF EXISTS `phong_giao_dich`;
CREATE TABLE `phong_giao_dich`  (
  `MaPhongGiaoDich` int(10) NOT NULL AUTO_INCREMENT,
  `TenPhong` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `DiaChi` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `DienThoai` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaPhongGiaoDich`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phong_giao_dich
-- ----------------------------
INSERT INTO `phong_giao_dich` VALUES (1, 'VIB Ha Dong', 'T?ng 1,2 - Tòa nhà Ellipse Tower, 110 Tr?n Phú, ph??ng M? Lao, qu?n Hà ?ông, Hà N?i', '024 3354 4170');
INSERT INTO `phong_giao_dich` VALUES (2, 'VIB Ly Thuong Kiet', 's? 64-68 Lý Th??ng Ki?t, P.Tr?n H?ng ??o, Q.Hoàn Ki?m, TP. Hà N?i', '024 39426919');
INSERT INTO `phong_giao_dich` VALUES (3, 'VIB Le Thanh Tong', 's? 5 Lê Thánh Tông, P.Phan Chu Trinh, Q.Hoàn Ki?m, Hà N?i', '024 3825 8202');
INSERT INTO `phong_giao_dich` VALUES (4, 'VIB Hai Ba Trung', 'Tòa nhà 59 Quang Trung, P. Nguy?n Du, Q. Hai Bà Tr?ng, Hà N?i', '024 39445268');
INSERT INTO `phong_giao_dich` VALUES (5, 'VIB Lo Duc', 's? 106 Lò ?úc, ph??ng ??ng Mác, qu?n Hai Bà Tr?ng, TP Hà N?i', '024 3974 2256');

-- ----------------------------
-- Table structure for quay_giao_dich
-- ----------------------------
DROP TABLE IF EXISTS `quay_giao_dich`;
CREATE TABLE `quay_giao_dich`  (
  `MaQuayGiaoDich` int(10) NOT NULL AUTO_INCREMENT,
  `TenQuayGiaoDich` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `MaPhongGiaoDich` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`MaQuayGiaoDich`) USING BTREE,
  INDEX `MaPhongGiaoDich`(`MaPhongGiaoDich`) USING BTREE,
  CONSTRAINT `quay_giao_dich_ibfk_1` FOREIGN KEY (`MaPhongGiaoDich`) REFERENCES `phong_giao_dich` (`MaPhongGiaoDich`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of quay_giao_dich
-- ----------------------------
INSERT INTO `quay_giao_dich` VALUES (1, 'Quay giao dich so 1', 1);
INSERT INTO `quay_giao_dich` VALUES (2, 'Quay giao dich so 2', 1);
INSERT INTO `quay_giao_dich` VALUES (3, 'Quay giao dich so 3', 1);
INSERT INTO `quay_giao_dich` VALUES (4, 'Quay giao dich so 4', 1);
INSERT INTO `quay_giao_dich` VALUES (5, 'Quay giao dich so 1', 2);
INSERT INTO `quay_giao_dich` VALUES (6, 'Quay giao dich so 2', 2);
INSERT INTO `quay_giao_dich` VALUES (7, 'Quay giao dich so 3', 2);
INSERT INTO `quay_giao_dich` VALUES (8, 'Quay giao dich so 1', 3);
INSERT INTO `quay_giao_dich` VALUES (9, 'Quay giao dich so 2', 3);
INSERT INTO `quay_giao_dich` VALUES (10, 'Quay giao dich so 3', 3);
INSERT INTO `quay_giao_dich` VALUES (11, 'Quay giao dich so 1', 4);
INSERT INTO `quay_giao_dich` VALUES (12, 'Quay giao dich so 2', 4);
INSERT INTO `quay_giao_dich` VALUES (13, 'Quay giao dich so 3', 4);
INSERT INTO `quay_giao_dich` VALUES (14, 'Quay giao dich so 4', 4);
INSERT INTO `quay_giao_dich` VALUES (15, 'Quay giao dich so 5', 4);

-- ----------------------------
-- Table structure for so_tiet_kiem
-- ----------------------------
DROP TABLE IF EXISTS `so_tiet_kiem`;
CREATE TABLE `so_tiet_kiem`  (
  `MaSoTietKiem` int(10) NOT NULL AUTO_INCREMENT,
  `MaKhachHang` int(10) NULL DEFAULT NULL,
  `SoTienGui` int(20) NULL DEFAULT NULL,
  `MaLoaiTietKiem` int(10) NULL DEFAULT NULL,
  `KyHan` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `LaiSuat` double(3, 0) NULL DEFAULT NULL,
  `NgayHieuLuc` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `NgayHetHieuLuc` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaSoTietKiem`) USING BTREE,
  INDEX `MaKhachHang`(`MaKhachHang`) USING BTREE,
  INDEX `MaLoaiTietKiem`(`MaLoaiTietKiem`) USING BTREE,
  CONSTRAINT `so_tiet_kiem_ibfk_1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khach_hang` (`MaKhachHang`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `so_tiet_kiem_ibfk_2` FOREIGN KEY (`MaLoaiTietKiem`) REFERENCES `loai_tiet_kiem` (`MaLoaiTietKiem`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of so_tiet_kiem
-- ----------------------------
INSERT INTO `so_tiet_kiem` VALUES (4, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (5, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (6, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (7, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (8, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (9, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (10, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (11, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (12, 42, 1500, 1, '3 thang', 1, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (13, 43, 1500000, 1, '3 thang', 0, '10/10/2019', '10/10/2025');
INSERT INTO `so_tiet_kiem` VALUES (18, 64, 1000, 1, '1 tháng', 0, '123', '478');
INSERT INTO `so_tiet_kiem` VALUES (19, 65, 142, 1, '1 tháng', 0, '147', '258');
INSERT INTO `so_tiet_kiem` VALUES (20, 66, 4456, 1, '1 tháng', 1, '4564', '56456');
INSERT INTO `so_tiet_kiem` VALUES (21, 42, 1000000, 1, '1 tháng', 0, '10/10/2018', '10/10/2022');

SET FOREIGN_KEY_CHECKS = 1;
