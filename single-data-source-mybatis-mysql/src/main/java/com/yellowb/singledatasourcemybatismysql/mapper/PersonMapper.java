package com.yellowb.singledatasourcemybatismysql.mapper;

import com.yellowb.singledatasourcemybatismysql.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.*;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM userinfo")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "userName", column = "username")
    })
    List<Person> findAll();


}
