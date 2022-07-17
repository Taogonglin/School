package com.scu.student.dao;

import com.scu.student.entity.LabAppoint;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * author: Mr.Tao
 * description:
 * date: 2022-07-14-14-30
 */
public interface LabAppointDao {

    @Select("SELECT * FROM lab_appoint WHERE id = #{id}")
    LabAppoint getLabAppointById(@Param("id") String id);

    @Select("SELECT * FROM lab_appoint;")
    List<LabAppoint> getAllLabAppoint();
}
