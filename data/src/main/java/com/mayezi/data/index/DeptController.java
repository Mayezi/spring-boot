package com.mayezi.data.index;

import com.mayezi.data.bean.Department;
import com.mayezi.data.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyi_lc
 * DateTime: 2019-01-08 22:46
 */
@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;
    @RequestMapping("/dept/{id}")
    public Department getDeparment(@PathVariable Integer id){
        return departmentMapper.getDepartById(id);
    }
    @GetMapping("/dept")
    public Department insertDepartment(Department department) {
         departmentMapper.insertDept(department);
         return department;
    }
}
