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
@Table(name = "product_group")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productGroupId;

    private String productGroupName;

    @OneToMany(mappedBy = "productGroup")
    private Set<ProductDetails> productDetailsSet;


}
