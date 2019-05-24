package com.yellowb.singledatasourcemybatismysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yellowb.singledatasourcemybatismysql.mapper")
public class SingleDataSourceMybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleDataSourceMybatisMysqlApplication.class, args);
    }

}
