package com.learning.core.day5;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
			return true;
		}
        if (obj == null) {
			return false;
		}
        if (getClass() != obj.getClass()) {
			return false;
		}
        Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null) {
				return false;
			}
        } else if (!productId.equals(other.productId)) 
        {
			return false;
		}
        return true;
    }
}

public class D05P05 {
	  public static void main(String[] args) {
	        // Create a HashSet to store products
	        HashSet<Product> products = new HashSet<>();

	        // Add predefined product information to the HashSet
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Zen"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));

	        // Remove a particular product from the HashSet by using product ID
	        String productIdToRemove = "P002";
	        for (Product product : products) {
	            if (product.getProductId().equals(productIdToRemove)) 
	            {
	                products.remove(product);
	                break;
	            }
	        }

	        // Print all the remaining products
	      
	        for (Product product : products) 
	        {
	            System.out.println(product);
	        }
	    }

}