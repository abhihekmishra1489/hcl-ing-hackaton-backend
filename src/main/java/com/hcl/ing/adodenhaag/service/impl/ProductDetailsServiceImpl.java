package com.hcl.ing.adodenhaag.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hcl.ing.adodenhaag.service.ProductDetailsService;

public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Override
	public String getProductDetails(String productId) {
		Map<String, String> mapOfProductDetails = new HashMap<String, String>();
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		mapOfProductDetails.put("Name", "User-1");
		return "productDetails";
	}

}
