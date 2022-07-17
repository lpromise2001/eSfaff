/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : hello

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 17/07/2022 19:21:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `bookName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  PRIMARY KEY (`bookId`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '数据库', '小红', 25.00);
INSERT INTO `book` VALUES (2, '算法分析', '小宋', 60.00);
INSERT INTO `book` VALUES (3, 'c++', '小明', 20.00);
INSERT INTO `book` VALUES (4, 'java', '点哈偶', 63.52);
INSERT INTO `book` VALUES (6, 'python', '张三', 32.50);
INSERT INTO `book` VALUES (7, '2023年计算机组成原理复习指导', '王道论坛', 65.00);

SET FOREIGN_KEY_CHECKS = 1;
