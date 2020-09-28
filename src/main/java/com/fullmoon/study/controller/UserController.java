package com.fullmoon.study.controller;

import com.fullmoon.study.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Controller
@RequestMapping("/study/user")
public class UserController {

    @RequestMapping(value = "/getParameter")
    public String requestGetParameter(HttpServletRequest request, Model model) {
        // 从HttpServletRequest中获取参数
        Integer userId = Integer.valueOf(request.getParameter("id"));
        User user = new User();
        if (userId == 1) {
            user.setId(1);
            user.setAge(20);
            user.setName("刘景平");
            user.setPassword("123");
        }
        log.warn("user: " + user.toString());
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/userParam")
    public String userParam(String name, String password) {
        // 自动匹配参数
        System.out.println("name:" + name + "\t password:" + password);
        return "index";
    }

    @RequestMapping("/userClass")
    public String userClass(User user) {
        // 自动装箱
        System.out.println("name:" + user.getName() + "\t password:" + user.getPassword());
        return "index";
    }

    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(value = "name", required = false, defaultValue = "ljp") String name, @RequestParam(value = "password") String password) {
        // 在控制层获取参数
        System.out.println("name:" + name + "\t password:" + password);
        return "index";
    }

    @RequestMapping("/{a}/{b}/{c}/rest")
    public String test_rest(@PathVariable("a") String name, @PathVariable("b") String password, @PathVariable("c") int age){

        System.out.println(name+"\t"+password+"\t"+age);
        return "success";
    }
    @RequestMapping("/rest/{a}/{b}/{c}")
    public String test_rest2(@PathVariable("a") String name,@PathVariable("b") String password,@PathVariable("c") int age){

        System.out.println(name+"\t"+password+"\t"+age);
        return "success";
    }

}
