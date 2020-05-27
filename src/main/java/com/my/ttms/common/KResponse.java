package com.my.ttms.common;


//import com.my.ttms.util.JacksonUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KResponse {

    private int status = FaultCode.NORMAL.getCode();
    private Map<String, Object> data;
    private String error;
    private List<KError> errors;

    /**
     * 添加数据
     * @param key
     * @param value
     */
    public void addData(String key, Object value){
        if(key == null){
            return ;
        }
        if(this.data ==null){
            this.data = new HashMap<String, Object>();
        }
        this.data.put(key, value);
    }
    
    public Map<String, Object> getData() {
        return data;
    }
    
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<KError> getErrors() {
        return errors;
    }

    public void setErrors(List<KError> errors) {
        this.errors = errors;
    }
    
    public void setSuccess() {
        this.status = FaultCode.NORMAL.getCode();
    }
    
    public void setSysFail() {
        this.status = FaultCode.SYS_FAIL.getCode();
        this.error = FaultCode.SYS_FAIL.getMsg();
    }
    
    public void setBusinessFail() {
        this.status = FaultCode.BUSINESS_FAIL.getCode();
        this.error = FaultCode.BUSINESS_FAIL.getMsg();
    }
    
    public void setParamFail() {
        this.status = FaultCode.PARAM_FAIL.getCode();
        this.error = FaultCode.PARAM_FAIL.getMsg();
    }
    
    public void setNotLogin() {
        this.status = FaultCode.NOT_LOGIN.getCode();
        this.error = FaultCode.NOT_LOGIN.getMsg();
    }
    
    public void setSomeFail() {
    	this.status = FaultCode.SOME_OK.getCode();
    	this.error = FaultCode.SOME_OK.getMsg();
    }

    public void setNotMajorFail() {
        this.status = FaultCode.NOT_MAJOR.getCode();
        this.error = FaultCode.NOT_MAJOR.getMsg();
    }

    public void setNotData() {
        this.status = FaultCode.NOT_DATA.getCode();
        this.error = FaultCode.NOT_DATA.getMsg();
    }

    public void setNoAuth() {
        this.status = FaultCode.NO_AUTHORITY.getCode();
        this.error = FaultCode.NO_AUTHORITY.getMsg();
    }

    public static KResponse buildResponse(boolean flag,String msg, Map<String, Object> data ){
        KResponse response = new KResponse();
        if(flag){
            response.setSuccess();
            response.setData(data);
        }else{
            response.setError(msg);
            response.setBusinessFail();
        }
        return response;
    }

    public static KResponse buildSuccessResponse( Map<String, Object> data ){
        KResponse response = new KResponse();
        response.setSuccess();
        response.setData(data);
        return response;
    }
    public static KResponse buildErrorResponse(String msg){
        KResponse response = new KResponse();
        response.setError(msg);
        response.setBusinessFail();
        return response;
    }

    public static KResponse buildErrorResponse(String msg,Integer status){
        KResponse response = new KResponse();
        response.setError(msg);
        response.setStatus(status);
        return response;
    }


//    public String toString() {
//        try {
//            return JacksonUtil.obj2Str(this);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
////        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
//    }
}
