package com.example.demo.business.mapper;

import com.example.demo.business.dto.BusinessDto;
import com.example.demo.business.model.Business;
import com.example.demo.mappers.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/3/18 0018.
 */
@Mapper
@Repository
public interface BusinessMapper extends MyMapper<Business>{

    List<Business> findAll();

    void insertBusiness(BusinessDto businessDto);
}
