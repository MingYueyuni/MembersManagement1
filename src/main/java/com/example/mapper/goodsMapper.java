package com.example.mapper;

import com.example.pojo.goods;

public interface goodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}