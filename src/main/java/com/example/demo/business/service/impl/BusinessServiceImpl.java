package com.example.demo.business.service.impl;

import com.example.demo.business.dto.BusinessDto;
import com.example.demo.business.mapper.BusinessMapper;
import com.example.demo.business.model.Business;
import com.example.demo.business.service.BusinessService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/3/18 0018.
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;


    @Override
    public List<Business> findAll() {
        Business business=new Business();
        business.setId("1");
        business.setBusinessKey("businessKey");
        List<Business> businessList = new ArrayList<>();
        businessList.add(business);
        return businessMapper.findAll();
    }

    @Override
    public Object findItemByPage(int currentPage,int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
//        PageHelper.startPage(currentPage, pageSize);
//
//        List<Business> allItems = businessMapper.findAll();        //全部商品
//        int countNums = allItems.size();           //总记录数
//        PageBean<Business> pageData = new PageBean<>(currentPage, pageSize, countNums);
//        pageData.setItems(allItems);
        PageHelper.startPage(currentPage, pageSize);
        PageInfo<Business> businessPageInfo = new PageInfo<>(businessMapper.findAll());

        return businessPageInfo;
    }

    @Override
    public void insertBusiness(BusinessDto businessDto) {
        businessMapper.insertBusiness(businessDto);
    }

    @Override
    public Object testMapper(BusinessDto businessDto) {
        //List<Business> businessList = businessMapper.selectAll();
//        List<Business> select = businessMapper.select(businessDto);
        businessMapper.insertSelective(businessDto);
        return null;
    }
}
