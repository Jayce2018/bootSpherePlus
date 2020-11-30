/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : test0

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2020-11-30 09:40:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `library_book_0`
-- ----------------------------
DROP TABLE IF EXISTS `library_book_0`;
CREATE TABLE `library_book_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1333223412048396291 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of library_book_0
-- ----------------------------
INSERT INTO `library_book_0` VALUES ('1', 'demoData', '1', '1', '2020-01-06 15:11:33', null);
INSERT INTO `library_book_0` VALUES ('2', 'demoDat2', '2', '2', '2020-01-06 15:11:34', null);

-- ----------------------------
-- Table structure for `library_book_1`
-- ----------------------------
DROP TABLE IF EXISTS `library_book_1`;
CREATE TABLE `library_book_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1333216626683682819 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of library_book_1
-- ----------------------------
INSERT INTO `library_book_1` VALUES ('1', 'demoData', '1', '1', '2020-01-06 15:11:33', null);
INSERT INTO `library_book_1` VALUES ('2', 'demoDat2', '2', '2', '2020-01-06 15:11:34', null);
