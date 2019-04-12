package com.example.demo.shiro;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {
	User findByUserName(String userName);
}
