package org.jpa.jpacollection.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Cart_product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member2_id")
    private Member2 member2;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int count;
    private String product_name;
    private int price;

}
