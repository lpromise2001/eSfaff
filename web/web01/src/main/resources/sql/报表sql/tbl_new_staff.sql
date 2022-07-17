/*
 Navicat Premium Data Transfer

 Source Server         : jdbc
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost:3306
 Source Schema         : estaff

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : 65001

 Date: 16/07/2022 17:56:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_new_staff
-- ----------------------------
DROP TABLE IF EXISTS `tbl_new_staff`;
CREATE TABLE `tbl_new_staff`  (
  `num` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `dep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位名称',
  `staff_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `staff_sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `entry_date` date NULL DEFAULT NULL COMMENT '入职日期',
  `staff_education` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_new_staff
-- ----------------------------
INSERT INTO `tbl_new_staff` VALUES (1, '人力资源部', '职员', '张三', '男', '2020-02-06', '本科');
INSERT INTO `tbl_new_staff` VALUES (2, '公关部', '经理', '王新欣', '女', '2019-04-07', '研究生');
INSERT INTO `tbl_new_staff` VALUES (3, '市场部', '职员', '陈乐', '男', '2020-09-23', '本科');
INSERT INTO `tbl_new_staff` VALUES (4, '技术部', '总经理', '李勇', '男', '2018-12-22', '研究生');
INSERT INTO `tbl_new_staff` VALUES (5, '人力资源部', '经理', '徐静', '女', '2019-06-21', '研究生');

SET FOREIGN_KEY_CHECKS = 1;
