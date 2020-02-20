package com.hcl.ing.adodenhaag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.adodenhaag.entity.CustomerProductDetails;

@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProductDetails, Long> {

}
