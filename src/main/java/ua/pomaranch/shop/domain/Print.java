package ua.pomaranch.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Print {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "print_id")
    private long id;
    private String name;
    private String imgLink;

}
