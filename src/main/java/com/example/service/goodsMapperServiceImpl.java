package com.example.service;

import com.example.pojo.goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class goodsMapperServiceImpl implements goodsMapperService{
    @Resource
    private com.example.mapper.goodsMapper goodsMapper;
    @Override
    public goods findgoodsById(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }
}
