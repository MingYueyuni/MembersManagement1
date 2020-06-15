package com.example.service;

import com.example.pojo.members;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class membersMapperServiceImpl implements  membersMapperService {
    @Resource
    private com.example.mapper.membersMapper membersMapper;
    @Override
    public List<members> findAllmembers() {
        System.out.println(membersMapper.selectAllmembers());
        return membersMapper.selectAllmembers();
    }
}
