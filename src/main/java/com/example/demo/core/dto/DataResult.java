package com.example.demo.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataResult<T> extends BaseResponse {

    protected T data;

    //返回数据
    public DataResult(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
