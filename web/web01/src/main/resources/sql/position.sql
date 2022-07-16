/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50627
 Source Host           : localhost:3306
 Source Schema         : estaff

 Target Server Type    : MySQL
 Target Server Version : 50627
 File Encoding         : 65001

 Date: 16/07/2022 16:34:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_position
-- ----------------------------
DROP TABLE IF EXISTS `tbl_position`;
CREATE TABLE `tbl_position`  (
  `p_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位编号',
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位名称',
  `p_establishment` int(11) NULL DEFAULT NULL COMMENT '岗位编制(岗位剩余人数)',
  PRIMARY KEY (`p_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_position
-- ----------------------------
INSERT INTO `tbl_position` VALUES ('P01', '临时工', 100);
INSERT INTO `tbl_position` VALUES ('P02', '职员', 500);
INSERT INTO `tbl_position` VALUES ('P03', '经理', 50);
INSERT INTO `tbl_position` VALUES ('P04', '总经理', 10);
INSERT INTO `tbl_position` VALUES ('P05', '总裁', 5);
INSERT INTO `tbl_position` VALUES ('P06', '董事', 3);

SET FOREIGN_KEY_CHECKS = 1;
