package com.hcl.ing.adodenhaag.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hcl.ing.adodenhaag.controller.response.ProductDetailsResponse;
import com.hcl.ing.adodenhaag.service.ProductDetailsService;

@Component
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Override
	public String getProductDetails(String productId) {

		ProductDetailsResponse productDetailResponse = new ProductDetailsResponse();
		productDetailResponse.setId(123L);
		productDetailResponse.setProductName("Orange Saving Account");

		Map<String, String> mapOfProductDetails = new HashMap<String, String>();
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		return "productDetails";
	}

}
