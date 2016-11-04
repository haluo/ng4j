package com.szc.web.controller;

import com.szc.core.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhufeng on 15/8/21.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {


    @Resource
    private IUserService userService;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response, @PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("/user/info");
        mv.addObject("name", userService.get(1).getName());
        return mv;
    }


}
