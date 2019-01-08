package com.mayezi.thymeleaf.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangyi_lc
 * DateTime: 2019-01-08 11:01
 */
@Controller
public class IndexController {
    @RequestMapping("/{username}")
    public String index(@PathVariable String username, HttpServletRequest request){
        request.setAttribute("username",username);
        return "index";
    }
}
