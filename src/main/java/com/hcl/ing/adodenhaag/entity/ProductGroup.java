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
@Table(name = "product_group")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productGroupName;

    @OneToMany(mappedBy = "product_group")
    private Set<ProductDetails> productDetailsSet;


}
