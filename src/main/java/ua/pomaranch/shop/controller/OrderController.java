package ua.pomaranch.shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pomaranch.shop.domain.Order;
import ua.pomaranch.shop.service.OrderService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/add")
    public void addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
        log.info("Order " + order.toString() + "was added to repository");
    }
}
