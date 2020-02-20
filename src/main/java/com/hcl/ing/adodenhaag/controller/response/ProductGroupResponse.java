package com.hcl.ing.adodenhaag.controller.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductGroupResponse {
	@JsonIgnore
	private Long productGroupId;
	@JsonProperty("productName")
	private String productGroupName;
	@JsonProperty("productTypes")
	private List<String> accounts;
}
