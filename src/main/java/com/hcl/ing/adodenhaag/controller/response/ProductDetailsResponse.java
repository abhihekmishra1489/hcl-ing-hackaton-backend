package com.hcl.ing.adodenhaag.controller.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsResponse {
	private Long id;
	private String productName;
	private List<ProductGroupResponse> groupResponses;
}
