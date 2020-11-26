package ua.pomaranch.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pomaranch.shop.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
