/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : hello

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2022-07-16 16:14:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_department`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_department`;
CREATE TABLE `tbl_department` (
  `dep_id` varchar(50) NOT NULL COMMENT '部门编号',
  `dep_name` varchar(50) NOT NULL COMMENT '部门名称',
  `dep_manager` varchar(50) DEFAULT NULL COMMENT '部门经理',
  `dep_phone` varchar(50) DEFAULT NULL COMMENT '部门电话',
  `dep_description` varchar(255) DEFAULT NULL COMMENT '部门描述',
  `dep_date` date DEFAULT NULL COMMENT '部门成立日期',
  PRIMARY KEY (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_department
-- ----------------------------
INSERT INTO `tbl_department` VALUES ('D01', '人力资源部', '张三', '17811111111', '制定企业人力资源战略规划', '2020-01-01');
INSERT INTO `tbl_department` VALUES ('D02', '财务部', '李四', '17822222222', '合理使用资金，加强资金管理，做好工程结算工作，确保公司计划和利润指标的实现', '2020-01-03');
INSERT INTO `tbl_department` VALUES ('D03', '公关部', '王五', '17833333333', '对企业形象的定位、设计等事关企业形象整体建设方面问题进行统筹考虑', '2020-02-12');
INSERT INTO `tbl_department` VALUES ('D04', '设计部', '赵六', '17844444444', '把控设计进度，按照公司对项目开发进程的计划要求完成相关设计工作', '2020-01-01');
INSERT INTO `tbl_department` VALUES ('D05', '市场部', '孙七', '17855555555', '负责现有产品的定位和市场推广战略，包括产品定位和价格策略', '2020-01-01');
INSERT INTO `tbl_department` VALUES ('D06', '技术部', '钱八', '17866666666', '掌握公司核心技术，负责产品开发与技术研发', '2020-01-01');
INSERT INTO `tbl_department` VALUES ('D07', '卫生部', '周九', '17877777777', '负责公司卫生整洁', '2020-01-10');
