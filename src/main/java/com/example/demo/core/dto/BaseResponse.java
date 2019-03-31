package com.example.demo.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

    //错误代码
    protected String status = "0";
    //提示信息
    protected String message;

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
