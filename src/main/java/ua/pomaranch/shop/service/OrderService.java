package ua.pomaranch.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.pomaranch.shop.domain.Order;
import ua.pomaranch.shop.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

}
