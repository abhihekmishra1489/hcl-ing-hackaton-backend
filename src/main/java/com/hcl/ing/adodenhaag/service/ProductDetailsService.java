package com.hcl.ing.adodenhaag.service;

import java.util.Map;

import com.hcl.ing.adodenhaag.entity.CustomerProductDetails;

public interface ProductDetailsService {

	public Map<String, String> getProductDetails(String productId);

	public CustomerProductDetails getCustomerDetails(Long customerId);

}
