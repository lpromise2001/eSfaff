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

 Date: 16/07/2022 17:56:09
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_leave_staff
-- ----------------------------
DROP TABLE IF EXISTS `tbl_leave_staff`;
CREATE TABLE `tbl_leave_staff`  (
  `num` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `dep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位名称',
  `staff_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `staff_sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `leave_date` date NULL DEFAULT NULL COMMENT '离职日期',
  `leave_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '离职原因',
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_leave_staff
-- ----------------------------
INSERT INTO `tbl_leave_staff` VALUES (1, '人力资源部', '职员', '闪正清', '男', '2021-10-10', '个人原因');
INSERT INTO `tbl_leave_staff` VALUES (2, '财务部', '职员', '鲍田', '女', '2022-03-04', '个人原因');
INSERT INTO `tbl_leave_staff` VALUES (3, '公关部', '职员', '翁阳嘉', '男', '2021-09-19', '');
INSERT INTO `tbl_leave_staff` VALUES (4, '设计部', '经理', '彭含云', '女', '2022-01-10', '跳槽');
INSERT INTO `tbl_leave_staff` VALUES (5, '公关部', '经理', '叶博超', '男', '2022-02-22', '家庭原因');

SET FOREIGN_KEY_CHECKS = 1;
