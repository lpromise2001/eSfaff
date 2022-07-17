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

 Date: 16/07/2022 17:55:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_chang_department
-- ----------------------------
DROP TABLE IF EXISTS `tbl_chang_department`;
CREATE TABLE `tbl_chang_department`  (
  `num` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `old_dep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原部门名称',
  `new_dep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新部门名称',
  `staff_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `staff_sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `dep_chang_date` date NOT NULL COMMENT '部门调动日期',
  `dep_chang_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门调动原因',
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_chang_department
-- ----------------------------
INSERT INTO `tbl_chang_department` VALUES (1, '技术部', '人力资源部', '敬鹏飞', '男', '2022-01-05', '工作兴趣');
INSERT INTO `tbl_chang_department` VALUES (2, '财务部', '卫生部', '耿初兰', '女', '2021-10-08', '年龄渐长');
INSERT INTO `tbl_chang_department` VALUES (3, '人力资源部', '公关部', '柳锐立', '男', '2021-09-15', '人员平衡');
INSERT INTO `tbl_chang_department` VALUES (4, '财务部', '市场部', '竺雅', '女', '2021-11-19', '工作兴趣');

SET FOREIGN_KEY_CHECKS = 1;
