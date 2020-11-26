package ua.pomaranch.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.pomaranch.shop.enums.Category;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements Serializable {

    public Product(String name, String type, String description, BigDecimal price, LocalDate localDate, String picturePath, int amount, Category category) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.localDate = localDate;
        this.picturePath = picturePath;
        this.amount = amount;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    private String name;
    private String type;
    private String description;
    private BigDecimal price;
    private LocalDate localDate;
    private String picturePath;
    private int amount;
    @Enumerated(EnumType.STRING)
    private Category category;

}