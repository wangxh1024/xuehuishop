CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `passwordencrypt` varchar(64) NOT NULL COMMENT '密码',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `telphone` varchar(255) DEFAULT NULL COMMENT '手机',
  `qq` varchar(10) DEFAULT NULL COMMENT 'qq',
  `weixin` varchar(20) DEFAULT NULL COMMENT '微信',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `account` varchar(20) DEFAULT NULL COMMENT '账号',
  `birthday` varchar(20) DEFAULT NULL COMMENT '生日',
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';