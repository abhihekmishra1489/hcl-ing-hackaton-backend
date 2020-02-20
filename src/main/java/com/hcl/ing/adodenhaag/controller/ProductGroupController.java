package com.hcl.ing.adodenhaag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("productgroupdetails")
@Slf4j
public class ProductGroupController {

	@GetMapping
	public String getProductGroupDetails() {

		return "Gettting product group details";
	}
}
