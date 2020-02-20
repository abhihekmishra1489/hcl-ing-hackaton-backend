package com.hcl.ing.adodenhaag.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productdetails")
public class ProductDetailsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductDetailsController.class);

	@GetMapping("{id}")
	public void getProductDetails(@PathVariable String id) {
		LOGGER.info("getProductDetails called {}");
	}
}
