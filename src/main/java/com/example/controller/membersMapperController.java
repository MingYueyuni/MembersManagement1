package com.example.controller;

import com.example.pojo.members;
import com.example.service.membersMapperServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mem")
public class membersMapperController {
    @Resource
    private membersMapperServiceImpl membersMapperServiceImpl;
    @RequestMapping("/index")
    public Object getindex(){
        List<members> object=membersMapperServiceImpl.findAllmembers();
        return object;
    }
    @RequestMapping("/index")
    public Object s(){
        List<members> object=membersMapperServiceImpl.findAllmembers();
        return object;
    }
}
