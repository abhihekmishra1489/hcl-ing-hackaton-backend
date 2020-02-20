package com.hcl.ing.adodenhaag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.adodenhaag.entity.ProductGroup;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {

}
