package com.github.xhrg.demo.basic.util;

public class StringUtils {

    public boolean isEmpty(String str) {
        return org.springframework.util.StringUtils.hasLength(str);
    }
}
