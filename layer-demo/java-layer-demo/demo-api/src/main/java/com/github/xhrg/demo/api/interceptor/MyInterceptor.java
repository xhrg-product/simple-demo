package com.github.xhrg.demo.api.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class MyInterceptor implements HandlerInterceptor {
//
//    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
//        System.out.println("************BaseInterceptor preHandle executed**********");
//        return true;
//    }
//
//    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
//            throws Exception {
//        System.out.println("************BaseInterceptor postHandle executed**********");
//    }
//
//    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
//            throws Exception {
//        System.out.println("************BaseInterceptor afterCompletion executed**********");
//    }
//}