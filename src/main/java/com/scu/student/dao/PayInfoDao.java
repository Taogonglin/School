package com.scu.student.dao;

import com.scu.student.entity.PayInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * author: Mr.Tao
 * description:
 * date: 2022-07-14-14-31
 */
public interface PayInfoDao {

    @Select("SELECT * FROM pay_info WHERE sid = #{sid} AND id = #{id}")
    PayInfo getOnePayInfo(@Param("sid") String sid, @Param("id") String id);

    @Select("SELECT * FROM pay_info WHERE sid = #{sid}")
    List<PayInfo> getAllPayInfoBySid(@Param("sid") String sid);
}
