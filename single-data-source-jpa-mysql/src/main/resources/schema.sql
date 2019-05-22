CREATE DATABASE `persontest` CHARACTER SET 'utf8mb4';

use persontest;

CREATE TABLE `persontest`.`userinfo`  (
  `id` int(0) NOT NULL,
  `username` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO userinfo(id,username) VALUES(0,'Tom');
INSERT INTO userinfo(id,username) VALUES(1,'Mary');
INSERT INTO userinfo(id,username) VALUES(2,'Jack');