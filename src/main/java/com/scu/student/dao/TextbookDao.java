package com.scu.student.dao;

import com.scu.student.entity.Textbook;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface TextbookDao {

    @Select("SELECT * FROM textbook WHERE id = #{id}")
    Textbook getTextbookById(@Param("id") String id);
}
