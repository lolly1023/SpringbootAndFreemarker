package com.lolly1023.bd.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/28/17:18
 */
//@RestController//不能使用该注解，因为该注解中使用了@ResponseBody注解，会转为json格式
@Controller
public class TestController {
    @GetMapping("test")
    public String test(Model model){
        model.addAttribute("test", "简简单单进行测试");
        System.out.println("test");
        return "test";
    }
}
