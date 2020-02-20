package com.hcl.ing.adodenhaag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ing.adodenhaag.entity.ProductDetails;

public interface ProductGroupRepository extends JpaRepository<ProductDetails, Long> {

}
