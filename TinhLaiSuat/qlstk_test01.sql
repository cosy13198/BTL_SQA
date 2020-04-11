-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: qlstk_test
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `MaKhachHang` int(10) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `CMND` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `NgayCap` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `NoiCap` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SDT` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES (42,'phuongnt','174577345','','','',''),(43,'sdsdsdad','','','','',''),(44,'chuyentd','123456789','','','',''),(45,'tran duc chuyen','987654321','','','',''),(46,'fdssfssssd','','','','',''),(47,'sdsdasd','','','','',''),(48,'ngoc','','','','',''),(49,'dsdsfhfkjfd','','','','',''),(50,'fsfdwewewqe','','','','',''),(51,'jhhghuehrhe','','','','',''),(52,'nguyen thi phuong','174577543','12/11/2015','Thanh Hoa','Thanh Hoa','0989671646'),(53,'tran duc chuyen','987654321','10/11/2015','Thai Binh','Thai Binh','0398984666'),(54,'adffgssd','','','','',''),(55,'grkheeirwerk','','','','',''),(56,'tran hong anh','','','','',''),(57,'gfhegteywyeu','','','','',''),(58,'treytryerf','','','','',''),(59,'nhat thanh','174577435','10/10/2015','Thanh Hoa','Thanh Hoa','01234567'),(60,'nguyen thi trang','987654321','','','',''),(61,'nguyen quang huy','147258369','','','',''),(62,'nguyen van luong','741852963','','','',''),(63,'huy','1456789','','','',''),(64,'nhat thanh','1234567','','','',''),(65,'huyen','123456','','','',''),(66,'hong ngoc','9874445','','','',''),(67,'Nguyen Thi Phuong','174577345','12/11/2015','Thanh Hoa','Thanh Hoa','0989671646');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loai_tiet_kiem`
--

DROP TABLE IF EXISTS `loai_tiet_kiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loai_tiet_kiem` (
  `MaLoaiTietKiem` int(10) NOT NULL,
  `TenLoaiTietKiem` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`MaLoaiTietKiem`),
  KEY `MaLoaiTietKiem` (`MaLoaiTietKiem`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loai_tiet_kiem`
--

LOCK TABLES `loai_tiet_kiem` WRITE;
/*!40000 ALTER TABLE `loai_tiet_kiem` DISABLE KEYS */;
INSERT INTO `loai_tiet_kiem` VALUES (1,'Co thoi han'),(2,'Khong thoi han');
/*!40000 ALTER TABLE `loai_tiet_kiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_vien` (
  `MaNV` int(10) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgaySinh` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SDT` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaPhongGiaoDich` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaNV`) USING BTREE,
  KEY `MaPhongGiaoDich` (`MaPhongGiaoDich`) USING BTREE,
  CONSTRAINT `nhan_vien_ibfk_1` FOREIGN KEY (`MaPhongGiaoDich`) REFERENCES `phong_giao_dich` (`MaPhongGiaoDich`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (1,'Nguyen Thi Phuong','27/07/1998','Thanh Hoa','0989671646',1),(2,'Tran Duc Chuyen','28/02/1997','Thai Binh','0398984666',2),(3,'Nguyen Thi Hong Ngoc','11/03/1995','Thanh Hoa','0989206132',1),(4,'Trinh Thi Chi','27/10/1996','Ha Noi','0395402250',3),(5,'Nguyen Huu Lam','23/07/1994','Ha Noi','0343247150',4);
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phong_giao_dich`
--

DROP TABLE IF EXISTS `phong_giao_dich`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phong_giao_dich` (
  `MaPhongGiaoDich` int(10) NOT NULL AUTO_INCREMENT,
  `TenPhong` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DiaChi` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DienThoai` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`MaPhongGiaoDich`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phong_giao_dich`
--

LOCK TABLES `phong_giao_dich` WRITE;
/*!40000 ALTER TABLE `phong_giao_dich` DISABLE KEYS */;
INSERT INTO `phong_giao_dich` VALUES (1,'VIB Ha Dong','T?ng 1,2 - Tòa nhà Ellipse Tower, 110 Tr?n Phú, ph??ng M? Lao, qu?n Hà ?ông, Hà N?i','024 3354 4170'),(2,'VIB Ly Thuong Kiet','s? 64-68 Lý Th??ng Ki?t, P.Tr?n H?ng ??o, Q.Hoàn Ki?m, TP. Hà N?i','024 39426919'),(3,'VIB Le Thanh Tong','s? 5 Lê Thánh Tông, P.Phan Chu Trinh, Q.Hoàn Ki?m, Hà N?i','024 3825 8202'),(4,'VIB Hai Ba Trung','Tòa nhà 59 Quang Trung, P. Nguy?n Du, Q. Hai Bà Tr?ng, Hà N?i','024 39445268'),(5,'VIB Lo Duc','s? 106 Lò ?úc, ph??ng ??ng Mác, qu?n Hai Bà Tr?ng, TP Hà N?i','024 3974 2256');
/*!40000 ALTER TABLE `phong_giao_dich` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quay_giao_dich`
--

DROP TABLE IF EXISTS `quay_giao_dich`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quay_giao_dich` (
  `MaQuayGiaoDich` int(10) NOT NULL AUTO_INCREMENT,
  `TenQuayGiaoDich` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaPhongGiaoDich` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaQuayGiaoDich`) USING BTREE,
  KEY `MaPhongGiaoDich` (`MaPhongGiaoDich`) USING BTREE,
  CONSTRAINT `quay_giao_dich_ibfk_1` FOREIGN KEY (`MaPhongGiaoDich`) REFERENCES `phong_giao_dich` (`MaPhongGiaoDich`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quay_giao_dich`
--

LOCK TABLES `quay_giao_dich` WRITE;
/*!40000 ALTER TABLE `quay_giao_dich` DISABLE KEYS */;
INSERT INTO `quay_giao_dich` VALUES (1,'Quay giao dich so 1',1),(2,'Quay giao dich so 2',1),(3,'Quay giao dich so 3',1),(4,'Quay giao dich so 4',1),(5,'Quay giao dich so 1',2),(6,'Quay giao dich so 2',2),(7,'Quay giao dich so 3',2),(8,'Quay giao dich so 1',3),(9,'Quay giao dich so 2',3),(10,'Quay giao dich so 3',3),(11,'Quay giao dich so 1',4),(12,'Quay giao dich so 2',4),(13,'Quay giao dich so 3',4),(14,'Quay giao dich so 4',4),(15,'Quay giao dich so 5',4);
/*!40000 ALTER TABLE `quay_giao_dich` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_tiet_kiem`
--

DROP TABLE IF EXISTS `so_tiet_kiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_tiet_kiem` (
  `MaSoTietKiem` int(10) NOT NULL AUTO_INCREMENT,
  `MaKhachHang` int(10) DEFAULT NULL,
  `SoTienGui` int(20) DEFAULT NULL,
  `MaLoaiTietKiem` int(10) DEFAULT NULL,
  `KyHan` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `LaiSuat` double(3,0) DEFAULT NULL,
  `NgayHieuLuc` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgayHetHieuLuc` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaSoTietKiem`) USING BTREE,
  KEY `MaKhachHang` (`MaKhachHang`) USING BTREE,
  KEY `MaLoaiTietKiem` (`MaLoaiTietKiem`) USING BTREE,
  CONSTRAINT `so_tiet_kiem_ibfk_1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khach_hang` (`MaKhachHang`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `so_tiet_kiem_ibfk_2` FOREIGN KEY (`MaLoaiTietKiem`) REFERENCES `loai_tiet_kiem` (`MaLoaiTietKiem`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_tiet_kiem`
--

LOCK TABLES `so_tiet_kiem` WRITE;
/*!40000 ALTER TABLE `so_tiet_kiem` DISABLE KEYS */;
INSERT INTO `so_tiet_kiem` VALUES (4,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(5,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(6,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(7,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(8,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(9,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(10,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(11,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(12,42,1500,1,'3 thang',1,'10/10/2019','10/10/2025'),(13,43,1500000,1,'6 thang',1,'10/10/2019','10/10/2025'),(21,42,1000000,1,'12 tháng',1,'10/10/2018','10/10/2022');
/*!40000 ALTER TABLE `so_tiet_kiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'qlstk_test'
--
/*!50003 DROP PROCEDURE IF EXISTS `checkSTK` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `checkSTK`(
	IN stk int
)
BEGIN
	select * from so_tiet_kiem
	inner join khach_hang on so_tiet_kiem.MaKhachHang = khach_hang.MaKhachHang
    where so_tiet_kiem.MaSoTietKiem = stk;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getMemberBySTK` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMemberBySTK`(
	in stk int
)
BEGIN
	select * from so_tiet_kiem where so_tiet_kiem.MaSoTietKiem = stk;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-11 23:45:07
