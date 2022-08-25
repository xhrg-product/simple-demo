package com.github.xhrg.demo.api.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyFilter extends OncePerRequestFilter {

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws IOException, ServletException {

        String url = request.getRequestURL().toString();

        logger.info("do MyFilter start,url is {}" + url);
        filterChain.doFilter(request, response);
        logger.info("do MyFilter end" + url);
    }
}