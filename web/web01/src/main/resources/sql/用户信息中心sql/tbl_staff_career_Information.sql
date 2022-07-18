/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : estaff

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2022-07-16 17:21:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_staff_career_information`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff_career_information`;
CREATE TABLE `tbl_staff_career_information` (
  `staff_no` varchar(50) NOT NULL COMMENT '员工编号',
  `start_time` date NOT NULL COMMENT '起始年月 某一阶段从事工作或学习的起始年月',
  `end_time` date NOT NULL COMMENT '截止年月 该阶段从事工作或学习的截止年月',
  `company_name` varchar(50) DEFAULT NULL COMMENT '所在单位名称 该阶段从事工作或学习的单位名称',
  `job_description` varchar(50) DEFAULT NULL COMMENT '从事工作内容 该阶段从事工作或学习的内容',
  `p_name` varchar(50) DEFAULT NULL COMMENT '岗位名称',
  `monthly_salary` int(11) DEFAULT NULL COMMENT '月薪',
  `notes` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`staff_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff_career_information
-- ----------------------------
INSERT INTO `tbl_staff_career_information` VALUES ('S001', '2019-06-05', '2022-07-16', '德州三和电器有限公司', '管理公司事务', '经理', '8000', '无');
INSERT INTO `tbl_staff_career_information` VALUES ('S002', '2022-04-13', '2022-07-12', '山东康博实业有限公司', '进行项目管理', '项目经理', '6500', '无');
INSERT INTO `tbl_staff_career_information` VALUES ('S003', '2022-04-26', '2022-07-07', '德州市重点建设投资公司', '进行建设技术学习', '员工', '3000', '无');
