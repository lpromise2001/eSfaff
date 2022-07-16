/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : estaff

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2022-07-16 17:21:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_staff_family_and_social_relationships_info`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff_family_and_social_relationships_info`;
CREATE TABLE `tbl_staff_family_and_social_relationships_info` (
  `staff_no` varchar(50) NOT NULL COMMENT '员工编号',
  `relationship` varchar(50) NOT NULL COMMENT '与本人关系 下拉框：父亲、目前、配偶',
  `name_of_family` varchar(50) DEFAULT NULL COMMENT '姓名 员工亲属的姓名',
  `department_of_family` varchar(50) DEFAULT NULL COMMENT '所在单位 员工该亲属所在的单位',
  `position_of_family` varchar(50) DEFAULT NULL COMMENT '职位',
  `telephone_of_family` varchar(50) DEFAULT NULL COMMENT '联系电话 员工该亲属的联系电话',
  PRIMARY KEY (`staff_no`,`relationship`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff_family_and_social_relationships_info
-- ----------------------------
INSERT INTO `tbl_staff_family_and_social_relationships_info` VALUES ('S001', '母亲', '马冬梅', '德州市罗曼科贸有限公司', '经理', '13955547134');
INSERT INTO `tbl_staff_family_and_social_relationships_info` VALUES ('S001', '父亲', '赵云', '德州京信食品有限公司', '员工', '13964786554');
