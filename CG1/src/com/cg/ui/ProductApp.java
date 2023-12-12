package com.cg.ui;

import java.util.ArrayList;
import java.util.List;

import com.cg.business.Product;

public class ProductApp {

	public static void main(String[] args) {

		Product prod1 = new Product(1, "Pen", 100);
		Product prod2 = new Product(2, "Pencil", 50);
		Product prod3 = new Product(3, "Eraser", 10);
		Product prod4 = new Product(4, "Box", 200);
		Product prod5 = new Product(5, "Sharpener", 10);

		List<Product> prodslist = new ArrayList<Product>();
		prodslist.add(prod1);
		prodslist.add(prod2);
		prodslist.add(prod3);
		prodslist.add(prod4);
		prodslist.add(prod5);
		List<Product> prodslistPriceMorthan100 = new ArrayList<Product>();
		List<Product> prodslistPriceLessthan100 = new ArrayList<Product>();
		for (Product prodlist : prodslist) {
			// System.out.println(prodlist);
			if (prodlist.getProductPrice() >= 100) {
				prodslistPriceMorthan100.add(prodlist);
			}
			else {
			prodslistPriceLessthan100.add(prodlist);
			}

		}
		System.out.println(prodslistPriceMorthan100);
		System.out.println(prodslistPriceLessthan100);

	}

}
