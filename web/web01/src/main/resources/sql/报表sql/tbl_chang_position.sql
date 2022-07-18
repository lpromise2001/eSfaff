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

 Date: 16/07/2022 17:56:01
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_chang_position
-- ----------------------------
DROP TABLE IF EXISTS `tbl_chang_position`;
CREATE TABLE `tbl_chang_position`  (
  `num` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `dep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `old_p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原岗位名称',
  `new_p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新岗位名称',
  `staff_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `staff_sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `p_chang_date` date NULL DEFAULT NULL COMMENT '岗位调动日期',
  `p_chang_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位调动原因',
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_chang_position
-- ----------------------------
INSERT INTO `tbl_chang_position` VALUES (1, '人力资源部', '职员', '经理', '张翰海', '男', '2021-01-02', '升职');
INSERT INTO `tbl_chang_position` VALUES (2, '财务部', '职员', '经理', '隋涵雨', '女', '2021-02-26', '升职');
INSERT INTO `tbl_chang_position` VALUES (3, '设计部', '职员', '经理', '郭文', '男', '2021-06-17', '升职');
INSERT INTO `tbl_chang_position` VALUES (4, '市场部', '经理', '总经理', '苏诗文', '女', '2021-12-10', '升职');

SET FOREIGN_KEY_CHECKS = 1;
