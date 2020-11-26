package ua.pomaranch.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.pomaranch.shop.domain.Order;
import ua.pomaranch.shop.exceptions.OrderNotFoundException;
import ua.pomaranch.shop.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order getOrderById(long id){
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found"));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    public void updateOrder(long id, Order newOrder){
        Order old = getOrderById(id);
        old.setOrderItems(newOrder.getOrderItems());
        orderRepository.save(old);
    }
}
