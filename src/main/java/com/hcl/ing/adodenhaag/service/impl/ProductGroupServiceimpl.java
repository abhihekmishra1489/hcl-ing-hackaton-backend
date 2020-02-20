package com.hcl.ing.adodenhaag.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.ing.adodenhaag.controller.response.ProductGroupResponse;
import com.hcl.ing.adodenhaag.entity.ProductGroup;
import com.hcl.ing.adodenhaag.repository.ProductGroupRepository;
import com.hcl.ing.adodenhaag.service.ProductGroupService;

@Component
public class ProductGroupServiceimpl implements ProductGroupService {

	@Autowired
	private ProductGroupRepository productGroupRepository;

	@Override
	public List<ProductGroupResponse> getProductGroup() {
		ProductGroupResponse productGroupResponse1 = new ProductGroupResponse();

		productGroupResponse1.setProductGroupName("Saving");
		productGroupResponse1.setAccounts(Arrays.asList("Orange Saving Account", "child Saving account",
				"Saving Account for unicef", "Green Saving Account", "Saving Deposit"));

		ProductGroupResponse productGroupResponse2 = new ProductGroupResponse();
		productGroupResponse2.setProductGroupName("Payments");
		productGroupResponse2.setAccounts(Arrays.asList("Payments account", "Debit Card", "Quarterly Limit"));

		ProductGroupResponse productGroupResponse3 = new ProductGroupResponse();
		productGroupResponse3.setProductGroupName("Mortage");
		productGroupResponse3.setAccounts(Arrays.asList("Bank Saving Mortage", "Intrest-Only", "Annuity"));

		List<ProductGroupResponse> responses = new ArrayList<>();
		responses.add(productGroupResponse1);
		responses.add(productGroupResponse2);
		responses.add(productGroupResponse3);

		return responses;
	}

	@Override
	public List<ProductGroup> getProductGroupDetails() {
		return productGroupRepository.findAll();
	}

}
