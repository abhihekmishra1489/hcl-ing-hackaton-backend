package com.hcl.ing.adodenhaag.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hcl.ing.adodenhaag.controller.response.ProductDetailsResponse;
import com.hcl.ing.adodenhaag.service.ProductDetailsService;

@Component
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Override
	public Map<String, String> getProductDetails(String productId) {

		ProductDetailsResponse productDetailResponse = new ProductDetailsResponse();
		productDetailResponse.setId(123L);
		productDetailResponse.setProductName("Orange Saving Account");

		Map<String, String> mapOfProductDetails = new HashMap<>();
		mapOfProductDetails.put("ROI", "0.5%");
		mapOfProductDetails.put("Name", "Robert");
		mapOfProductDetails.put("DOB", "22-09-1992");
		mapOfProductDetails.put("Address", "Grubbehoeve");
		mapOfProductDetails.put("Balance", "200euro");
		mapOfProductDetails.put("Phone Number", "064550987");
		return mapOfProductDetails;
	}

}
