CREATE DATABASE IF NOT EXISTS `personalsite`;
USE `personalsite`;

DROP TABLE IF EXISTS `area`;
CREATE TABLE `area`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL COMMENT '名称',
  `parent_id` BIGINT(20) NOT NULL,
  `common` INT(4) NOT NULL,
  `type` VARCHAR(16) NOT NULL COMMENT '类型:省，市',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE KEY `area_name_UNIQUE`(name)
)ENGINE=InnoDB DEFAULT CHARSET =utf8;