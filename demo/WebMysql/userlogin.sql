/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 02/01/2020 14:15:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userlogin
-- ----------------------------
DROP TABLE IF EXISTS `userlogin`;
CREATE TABLE `userlogin`  (
  `UId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userlogin
-- ----------------------------
INSERT INTO `userlogin` VALUES (NULL, '老辜(猪)', '嘟嘟嘟');
INSERT INTO `userlogin` VALUES (NULL, '猪猪', '辜辜');

SET FOREIGN_KEY_CHECKS = 1;
