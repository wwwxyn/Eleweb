package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.epss.service.CustomerService;
import vip.epss.service.OrdersService;


@Controller
@RequestMapping(value = "/orders")
public class OrdersrestController {
    @Autowired
    private OrdersService ordersService;


}