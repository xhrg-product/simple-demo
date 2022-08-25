package com.github.xhrg.demo.app.facade;

import com.github.xhrg.demo.domain.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    @Autowired
    private OrderService orderService;

    public String query() {
        return orderService.query();
    }

}
