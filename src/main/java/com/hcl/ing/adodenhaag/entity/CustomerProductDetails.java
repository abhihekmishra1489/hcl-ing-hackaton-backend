package com.hcl.ing.adodenhaag.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer_product_details")
public class CustomerProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerName;

    private String age;

    private String accountBalance;

    @OneToMany(mappedBy = "customer_product_details")
    private Set<ProductDetails> productDetailsSet;
}
