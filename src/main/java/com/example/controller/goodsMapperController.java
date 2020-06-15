package com.example.controller;

import com.example.pojo.goods;
import com.example.service.goodsMapperServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class goodsMapperController {
    @Resource
    private goodsMapperServiceImpl goodsMapperServiceImpl;
    @RequestMapping("/index")
    public Object getindex(int id){
        goods goods=goodsMapperServiceImpl.findgoodsById(id);
        return goods;
    }
}
