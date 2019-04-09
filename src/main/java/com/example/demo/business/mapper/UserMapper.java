package com.example.demo.business.mapper;

import com.example.demo.business.model.User;
import com.example.demo.mappers.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends MyMapper<User> {

    User selectByUserName(String userName);
}
