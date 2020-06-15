package com.example.mapper;

import com.example.pojo.members;

import java.util.List;

public interface membersMapper {
    List<members> selectAllmembers();

    int deleteByPrimaryKey(Integer id);

    int insert(members record);

    int insertSelective(members record);

    members selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(members record);

    int updateByPrimaryKey(members record);
}