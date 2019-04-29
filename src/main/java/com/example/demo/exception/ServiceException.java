package com.example.demo.exception;

public class ServiceException extends BusinessException {

    public ServiceException(String code, String msg) {
        super(code, msg);
    }
}
