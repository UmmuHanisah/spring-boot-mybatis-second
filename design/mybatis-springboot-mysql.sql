mybatis-springboot-mysql
************************

--Title: MyBatis Spring Boot Example with MySQL | Select and Insert
--Source: https://www.youtube.com/watch?v=ZP8Um12Z_mk

create database mybatistest;
use mybatistest;

CREATE TABLE users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    salary float(10) DEFAULT NULL,
    PRIMARY KEY (id)
);

commit;