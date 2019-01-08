package com.mayezi.data.mapper;

import com.mayezi.data.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author zhangyi_lc
 * DateTime: 2019-01-08 22:42
 */
//@Mapper

public interface DepartmentMapper {
    @Select("SELECT * FROM DEPARTMENT WHERE ID=#{id}")
    Department getDepartById(Integer id);
    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDept(Department department);
    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    int updateDept(Department department);
}
