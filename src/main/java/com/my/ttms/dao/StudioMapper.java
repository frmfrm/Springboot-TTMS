package com.my.ttms.dao;

import com.my.ttms.bean.Studio;
import com.my.ttms.bean.StudioExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int countByExample(StudioExample example);

    List<Studio> selectByStudioName(String studioName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int deleteByExample(StudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer studioId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int insert(Studio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int insertSelective(Studio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    List<Studio> selectByExample(StudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    Studio selectByPrimaryKey(Integer studioId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Studio record, @Param("example") StudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Studio record, @Param("example") StudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Studio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Studio record);

    List<Studio> selectByStudioName(String studioname);
}