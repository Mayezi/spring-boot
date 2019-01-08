package com.mayezi.data.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhangyi_lc
 * DateTime: 2019-01-08 21:28
 */
@RestController
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping("/query")
    public Map query(){
        return jdbcTemplate.queryForList("SELECT * from department").get(0);
    }

}
