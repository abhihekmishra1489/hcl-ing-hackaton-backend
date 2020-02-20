package com.hcl.ing.adodenhaag.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Table(name = "customer_product_details")
public class CustomerProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String customerName;

    private int age;

    private String accountBalance;

    @OneToMany(cascade=CascadeType.PERSIST)
    private Set<ProductDetails> productDetailsSet;
}
