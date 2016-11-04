package com.szc.web.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 基础controller类
 */
public class BaseController {
    public static Logger log = Logger.getLogger(BaseController.class);

    //默认的cookie过期时间
    public static final int COOKIE_TIMES = 365 * 24 * 60 * 60;
    private static final int DEF_COOKIE_TIMES = 60 * 60;

    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";

    public static void addCookieItem(String key, String value, HttpServletRequest request, HttpServletResponse response) {
        addCookiItem(key, value, DEF_COOKIE_TIMES, request, response);
    }

    /**
     * 全站范围内添加缓存
     *
     * @param key
     * @param value
     * @param time
     * @param request
     * @param response
     */
    public static void addCookiItem(String key, String value, int time, HttpServletRequest request, HttpServletResponse response) {
        try {
            if (value != null) {
                value = URLEncoder.encode(value, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(time);
        String path = request.getContextPath();
        if (StringUtils.isEmpty(request.getContextPath())) {
            path = "/";
        }
        cookie.setPath(path);
        response.addCookie(cookie);
    }

    public static void removeCookieItem(String key, HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie(key, null);
        cookie.setMaxAge(0);
        String path = request.getContextPath();
        if (StringUtils.isEmpty(request.getContextPath())) {
            path = "/";
        }
        cookie.setPath(path);
        response.addCookie(cookie);
    }

    /**
     * 根据cookie key获得value
     *
     * @param cookies
     * @param key
     * @return
     */
    public static String getCookieValue(Cookie[] cookies, String key) {
        String value = null,
                name = "";
        if (cookies == null)
            return null;
        for (Cookie cookie : cookies) {
            name = cookie.getName();
            if (key.equals(name)) {
                try {
                    value = cookie.getValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        return value;
    }


    public static void main(String[] args) {

    }
}
