package com.scu.student.dao;


import com.scu.student.entity.GdesignInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GdesignInfoDao {

    @Select("SELECT * FROM gdesign_info WHERE id = #{id}")
    GdesignInfo getGdesignInfoById(@Param("id") String id);
}
