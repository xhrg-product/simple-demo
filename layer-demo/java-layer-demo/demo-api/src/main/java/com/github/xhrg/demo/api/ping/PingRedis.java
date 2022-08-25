package com.github.xhrg.demo.api.ping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PingRedis {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("/redis_set")
    public Object set() {
        redisTemplate.opsForValue().set("a", new Date().toString());
        return "true";
    }

    @RequestMapping("/redis_get")
    public Object get() {
        return redisTemplate.opsForValue().get("a");
    }

}
