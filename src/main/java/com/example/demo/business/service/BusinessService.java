package com.example.demo.business.service;

import com.example.demo.business.dto.BusinessDto;
import com.example.demo.business.model.Business;

import java.util.List;

/**
 * Created by Administrator on 2019/3/18 0018.
 */
public interface BusinessService {

    List<Business> findAll();

    Object findItemByPage(int currentPage,int pageSize);

    void insertBusiness(BusinessDto businessDto);

    Object testMapper(BusinessDto businessDto);
}
