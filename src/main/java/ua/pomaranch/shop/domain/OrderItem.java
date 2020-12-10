package ua.pomaranch.shop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "order_items")
@NoArgsConstructor
public class OrderItem implements Serializable {

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "order_id")
    private Order order;

    public BigDecimal subTotal() {
        return product.getPrice().multiply(BigDecimal.valueOf(quantity));
    }
}
