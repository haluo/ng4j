package com.szc.web.controller;

import com.alibaba.fastjson.JSON;
import com.szc.core.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhufeng on 15/8/21.
 */
@Controller
public class IndexController extends BaseController{


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {

        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return null;
    }



//    @RequestMapping(value = "/json1", method = RequestMethod.GET)
//    public User json1(HttpServletRequest request, HttpServletResponse response) {
//        User user = new User();
//        user.setName("xiaoming");
//        user.setCreated(new Date());
//        user.setStatus(1);
//        return user;
//    }

    @ResponseBody
    @RequestMapping(value = "/json2", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String json2(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>();
        result.put("name","zhang");
        result.put("age",18);
        result.put("birthDay",new Date());
        User user = new User();
        user.setName("hua");
        user.setType(2);
        result.put("user",user);
        return JSON.toJSONString(result);
    }



}
