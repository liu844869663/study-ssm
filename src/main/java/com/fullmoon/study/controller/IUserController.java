package com.fullmoon.study.controller;

import com.fullmoon.study.dao.UserDao;
import com.fullmoon.study.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Log4j2
@Controller
@RequestMapping(value = "/fullmoon")
public class IUserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/queryUser", method = { RequestMethod.GET })
    public void queryUser(@RequestParam(value = "id", defaultValue = "1") Integer id) {
        System.out.println(id);
        User user = userDao.queryUserById(id);
        if(user != null) {
            System.out.println(user.toString());
        }
    }

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public String register(){
        log.info("进入注册用户页面");
        return "register";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(){
        log.info("进入登录用户页面");
        return "login";
    }

    @RequestMapping(value = "/register/addUser")
    public ModelAndView register(User user){
        log.info("开始添加用户");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loginResult");
        modelAndView.addObject("user", user);
        log.info("添加成后进入主页");
        return modelAndView;
    }

    @RequestMapping(value = "/login/result", method = {RequestMethod.POST})
    public ModelAndView loginResult(User user){
        log.info("进入主页");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loginResult");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
