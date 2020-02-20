package com.hcl.ing.adodenhaag.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Getter
@Setter
@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productDetailsId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="product_group_id", nullable=false)
    private ProductGroup productGroup;

    private String productName;


}
