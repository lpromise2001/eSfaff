/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : estaff

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 16/07/2022 16:33:33
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_staff_induction
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff_induction`;
CREATE TABLE `tbl_staff_induction`  (
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工职位\r\n',
  `staff_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工姓名',
  `staff_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工编号',
  `staff_sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工性别',
  `staff_phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码' 
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_staff_induction
-- ----------------------------
INSERT INTO `tbl_staff_induction` VALUES ('经理', '张三', '1', '男', '123');
INSERT INTO `tbl_staff_induction` VALUES ('职员', '李四', '2', '女', '456');

SET FOREIGN_KEY_CHECKS = 1;
