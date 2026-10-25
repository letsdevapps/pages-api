package com.pro.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/product")
@Tag(name = "Product", description = "Operations related to Product API")
public class ProductApi {

	@GetMapping({ "", "/" })
	@Operation(summary = "Return Product Api Index")
	public String index() {
		return "----- Product Service | Product Api | Index -----";
	}

	@GetMapping("/list")
	@Operation(summary = "Return Product Api List")
	public String getProducts() {
		return "----- Product Service | Product Api | List -----";
	}
}