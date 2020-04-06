-- --------------------------
-- Table structure for `user`
-- --------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL  AUTO_INCREMENT,
  `username` varchar(50) DEFAULT  '',
  `password` varchar(50) DEFAULT  '',
  `name` varchar(50) DEFAULT '',
  `age` int(3) DEFAULT 0,
  `sex` int(1) DEFAULT 1,
  `note` varchar(50) DEFAULT '',
  `birthday` timestamp DEFAULT NOW(),
  `created` timestamp default NOW(),
  `updated` timestamp default NOW(),
  PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;