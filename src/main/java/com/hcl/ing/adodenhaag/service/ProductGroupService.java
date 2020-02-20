package com.hcl.ing.adodenhaag.service;

import java.util.List;

import com.hcl.ing.adodenhaag.controller.response.ProductGroupResponse;
import com.hcl.ing.adodenhaag.entity.ProductGroup;

public interface ProductGroupService {

	public List<ProductGroupResponse> getProductGroup();

	public List<ProductGroup> getProductGroupDetails();
}
