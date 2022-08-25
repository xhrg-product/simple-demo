package com.github.xhrg.demo.basic.http;

import org.springframework.stereotype.Component;

@Component
public class HttpService {
    public String doGet() {
        return "mock_http_get_response";
    }
}
