package com.pro.apigateway.product_service.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Product", description = "Operations related to Product API")
public class ProductApi {

	@GetMapping({ "", "/" })
	@Operation(summary = "Return the index of the application")
	public String index() {
		return "Product Service - Index";
	}

	@GetMapping("/list")
	@Operation(summary = "Return the Product List")
	public String getProducts() {
		return "Product Service - List of Products";
	}
}
