package com.my.ttms.common;

public enum FaultCode {
    NORMAL(0, "normal"),
    
    PARAM_FAIL(1, "params fail"),
    
    NOT_LOGIN(2, "not login"),
    
    BUSINESS_FAIL(3, "business fail"),
    
    SYS_FAIL(100, "sys fail"),
    
    SOME_OK(300, "some fail"),
    
    SYS_EXCEPTION(4, "sys exception"),
    
    CACHE_PARAM_EXCEPTION (5,"cache param exception"),
    
    NOT_DATA(6,"not data"),

    NOT_MAJOR(7,"not major worksheet"),

    NO_AUTHORITY(8,"您没有该数据权限,请联系管理员添加"),

    EXCEPTION(-1,"system exception");
    
    private String msg;
    private int code;

    FaultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

}
