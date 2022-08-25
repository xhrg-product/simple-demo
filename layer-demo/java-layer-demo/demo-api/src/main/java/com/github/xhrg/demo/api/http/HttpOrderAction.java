package com.github.xhrg.demo.api.http;

import com.github.xhrg.demo.app.facade.OrderFacade;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class HttpOrderAction {

    private final static Logger log = LoggerFactory.getLogger(HttpOrderAction.class);

    @Autowired
    private OrderFacade orderFacade;

    @GetMapping("/query")
    @ApiOperation(value = "查询订单", notes = "通过Id查询订单")
    @ApiImplicitParam(name = "orderId", value = "订单编号", required = true, dataType = "string")
    public Object query() {
        log.info("order/query");
        return orderFacade.query();
    }
}
