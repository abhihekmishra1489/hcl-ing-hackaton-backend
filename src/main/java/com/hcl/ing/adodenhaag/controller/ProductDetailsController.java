package com.hcl.ing.adodenhaag.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.adodenhaag.service.ProductDetailsService;

@RestController
@RequestMapping("/productdetails")
public class ProductDetailsController {

	@Autowired
	private ProductDetailsService productDetailsService;

	@GetMapping("{id}")
	public Map<String, String> getProductDetails(@PathVariable String id) {
		return productDetailsService.getProductDetails(id);
	}
}
