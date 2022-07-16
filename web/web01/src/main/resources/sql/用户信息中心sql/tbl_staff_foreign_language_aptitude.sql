/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : estaff

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2022-07-16 17:21:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_staff_foreign_language_aptitude`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff_foreign_language_aptitude`;
CREATE TABLE `tbl_staff_foreign_language_aptitude` (
  `staff_no` varchar(50) NOT NULL COMMENT '员工编号',
  `foreign_languages` varchar(50) NOT NULL COMMENT '外国语种',
  `proficiency_in_foreign_languages` int(11) DEFAULT NULL COMMENT '外国语种熟练程度',
  PRIMARY KEY (`staff_no`,`foreign_languages`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff_foreign_language_aptitude
-- ----------------------------
INSERT INTO `tbl_staff_foreign_language_aptitude` VALUES ('S001', '英语', '1');
INSERT INTO `tbl_staff_foreign_language_aptitude` VALUES ('S002', '法语', '2');
