package com.github.xhrg.demo.basic.mapper;

import com.github.xhrg.demo.basic.model.PersonModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {

    @Select("SELECT * FROM person")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    List<PersonModel> getAll();

}