package com.github.xhrg.demo.basic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.xhrg.demo.basic.model.OrderModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper extends BaseMapper<OrderModel> {

    @Select("select * from orders")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    List<OrderModel> getAll();
}