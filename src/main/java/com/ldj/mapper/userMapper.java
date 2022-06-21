package com.ldj.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {

    @Insert("insert into t1 values(1,'1.1.1','1','2')")
    void insertOne();
}
