package com.my.ttms.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;


/**
 * 类Response.java的实现描述：
 * @author zhaofei
 * @date 2018年1月4日下午8:48:24
 */
public class Response<T> {
  private int status = FaultCode.NORMAL.getCode();
  private T data;
  private List<KError> errors = new ArrayList<KError>();

  public T getData() {
      return data;
  }

  public Boolean isNotFail() {
      if (this.status == FaultCode.NORMAL.getCode()) {
          return true;
      }
      return false;
  }

  public void setData(T data) {
      this.data = data;
  }

  public int getStatus() {
      return status;
  }

  public void setStatus(int status) {
      this.status = status;
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
  }

  public void setBusinessFail() {
      this.status = FaultCode.BUSINESS_FAIL.getCode();
  }

  public void makeFail(FaultCode code) {
      this.status = code.getCode();
  }

  public void setParamFail() {
      this.status = FaultCode.PARAM_FAIL.getCode();
  }

 

  public static Response<Object> makeFailResponse(FaultCode faultCode) {
      Response<Object> response = new Response<Object>();
      response.makeFail(faultCode);
      return response;
  }

  public static Response<Object> makeParamsFailResponse() {
      Response<Object> response = new Response<Object>();
      response.setParamFail();
      return response;
  }

  public Response() {
      super();
  }

  public Response(int status) {
      super();
      this.status = status;
  }

  public Response(int status, T data) {
      super();
      this.status = status;
      this.data = data;
  }

  public Response(int status, T data, List<KError> errors) {
      super();
      this.status = status;
      this.data = data;
      this.errors = errors;
  }

  public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
