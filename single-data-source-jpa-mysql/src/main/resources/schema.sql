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
INSERT INTO userinfo(id,username) VALUES(3,'Ken');
INSERT INTO userinfo(id,username) VALUES(4,'Jimmy');
INSERT INTO userinfo(id,username) VALUES(5,'Jonas');
INSERT INTO userinfo(id,username) VALUES(6,'Billy');
INSERT INTO userinfo(id,username) VALUES(7,'Henry');
INSERT INTO userinfo(id,username) VALUES(8,'Trump');
INSERT INTO userinfo(id,username) VALUES(9,'Apple');