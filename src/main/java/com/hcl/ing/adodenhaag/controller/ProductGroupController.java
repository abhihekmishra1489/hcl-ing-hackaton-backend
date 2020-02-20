package com.hcl.ing.adodenhaag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.adodenhaag.controller.response.ProductGroupResponse;
import com.hcl.ing.adodenhaag.service.ProductGroupService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("productgroupdetails")
public class ProductGroupController {

	@Autowired
	private ProductGroupService productGroupService;

	@GetMapping
	public List<ProductGroupResponse> getProductGroupDetails() {
		return productGroupService.getProductGroup();

	}
}
