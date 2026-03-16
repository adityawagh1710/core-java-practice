package com.practice.optionalclass;

import java.util.Optional;

class ProductService {
	
	public Optional<String> findProduct(int id) {
		
		if (id == 101) {
			return Optional.of("Laptop Found");
		}
		
		return Optional.empty();
	}
}

public class OptionalExample3 {
	
	public static void main(String[] args) {
		
		int[] productIds = {100, 101, 102, 103, 104, 105};
		
		ProductService service = new ProductService();
		
		for (Integer productId : productIds) {
			
			Optional<String> product = service.findProduct(productId);
			
			if(product.isPresent()){
				System.out.println(product.get());
			} else {
				System.out.println("Product not found");
			}
		}
	}
}