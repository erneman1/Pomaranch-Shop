package ua.pomaranch.shop.domain;

import lombok.Data;
import ua.pomaranch.shop.exceptions.OrderNotFoundException;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL})
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addToOrderList(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }
    public BigDecimal getTotal(){
        return orderItems.stream()
                .map(OrderItem::subTotal)
                .reduce(BigDecimal::add)
                .orElseThrow(() -> new OrderNotFoundException("Order not found"));
    }

}
