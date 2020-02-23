package com.hcl.ing.adodenhaag.service.impl;

import com.hcl.ing.adodenhaag.controller.response.ProductDetailsResponse;
import com.hcl.ing.adodenhaag.entity.CustomerProductDetails;
import com.hcl.ing.adodenhaag.repository.CustomerProductRepository;
import com.hcl.ing.adodenhaag.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class ProductDetailsServiceImpl implements ProductDetailsService {

    @Autowired
    private CustomerProductRepository customerProductRepository;

    @Override
    public Map<String, String> getProductDetails(String productId) {

        ProductDetailsResponse productDetailResponse = new ProductDetailsResponse();
        //productDetailResponse.setId(123L);
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

    @Override
    public CustomerProductDetails getCustomerDetails(Long customerId) {
        Optional<CustomerProductDetails> customerProductDetails = customerProductRepository.findById(customerId);
        return customerProductDetails.get();
    }

}
