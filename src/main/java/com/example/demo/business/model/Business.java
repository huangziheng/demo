package com.example.demo.business.model;

import com.example.demo.core.dto.PageBean;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2019/3/18 0018.
 */
@Table(name="business")
public class Business /*extends PageBean*/{
    @Id
    private String id;

    private String businessKey;

    private String purchaseName;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }
}
