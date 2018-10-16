/*
Navicat MySQL Data Transfer

Source Server         : zhfTest
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : clouddb02

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-10-16 16:36:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL auto_increment,
  `dname` varchar(20) default NULL,
  `db_source` varchar(20) default NULL,
  PRIMARY KEY  (`deptno`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '人事部', 'clouddb02');
INSERT INTO `dept` VALUES ('2', '行政部', 'clouddb02');
INSERT INTO `dept` VALUES ('3', '开发部', 'clouddb02');
INSERT INTO `dept` VALUES ('4', '测试部', 'clouddb02');
INSERT INTO `dept` VALUES ('5', '美工部', 'clouddb02');
