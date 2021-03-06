package com.my.ttms.bean;

import java.io.Serializable;

public class Employee implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.emp_no
     *
     * @mbggenerated
     */
    private String empNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.emp_name
     *
     * @mbggenerated
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.emp_telNum
     *
     * @mbggenerated
     */
    private String empTelnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.bankcarid
     *
     * @mbggenerated
     */
    private String bankcarid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.paypwd
     *
     * @mbggenerated
     */
    private String paypwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.user_pwd
     *
     * @mbggenerated
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.user_id
     *
     * @return the value of employee.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.user_id
     *
     * @param userId the value for employee.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.emp_no
     *
     * @return the value of employee.emp_no
     *
     * @mbggenerated
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.emp_no
     *
     * @param empNo the value for employee.emp_no
     *
     * @mbggenerated
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.emp_name
     *
     * @return the value of employee.emp_name
     *
     * @mbggenerated
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.emp_name
     *
     * @param empName the value for employee.emp_name
     *
     * @mbggenerated
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.emp_telNum
     *
     * @return the value of employee.emp_telNum
     *
     * @mbggenerated
     */
    public String getEmpTelnum() {
        return empTelnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.emp_telNum
     *
     * @param empTelnum the value for employee.emp_telNum
     *
     * @mbggenerated
     */
    public void setEmpTelnum(String empTelnum) {
        this.empTelnum = empTelnum == null ? null : empTelnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.address
     *
     * @return the value of employee.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.address
     *
     * @param address the value for employee.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.bankcarid
     *
     * @return the value of employee.bankcarid
     *
     * @mbggenerated
     */
    public String getBankcarid() {
        return bankcarid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.bankcarid
     *
     * @param bankcarid the value for employee.bankcarid
     *
     * @mbggenerated
     */
    public void setBankcarid(String bankcarid) {
        this.bankcarid = bankcarid == null ? null : bankcarid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.paypwd
     *
     * @return the value of employee.paypwd
     *
     * @mbggenerated
     */
    public String getPaypwd() {
        return paypwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.paypwd
     *
     * @param paypwd the value for employee.paypwd
     *
     * @mbggenerated
     */
    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.status
     *
     * @return the value of employee.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.status
     *
     * @param status the value for employee.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.user_pwd
     *
     * @return the value of employee.user_pwd
     *
     * @mbggenerated
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.user_pwd
     *
     * @param userPwd the value for employee.user_pwd
     *
     * @mbggenerated
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", empNo=").append(empNo);
        sb.append(", empName=").append(empName);
        sb.append(", empTelnum=").append(empTelnum);
        sb.append(", address=").append(address);
        sb.append(", bankcarid=").append(bankcarid);
        sb.append(", paypwd=").append(paypwd);
        sb.append(", status=").append(status);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}