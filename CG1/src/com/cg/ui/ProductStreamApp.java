package com.cg.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.business.Product;

public class ProductStreamApp {

	public static void main(String[] args) {


//		Product prod1 = new Product(1, "Pen", 100);
//		Product prod2 = new Product(2, "Pencil", 50);
//		Product prod3 = new Product(3, "Eraser", 10);
//		Product prod4 = new Product(4, "Box", 200);
//		Product prod5 = new Product(5, "Sharpener", 10);

		List<Product> prodslist = new ArrayList<Product>();
		prodslist.add(new Product(1, "Pen", 100));
		prodslist.add(new Product(2, "Pencil", 50));
		prodslist.add(new Product(3, "Eraser", 20));
		prodslist.add(new Product(4, "Box", 200));
		prodslist.add(new Product(5, "Sharpener", 10));
		List<String> prodslistNamesLessthan100 =prodslist.stream().filter(p->p.getProductPrice()<100).map(p->p.getProductName()).collect(Collectors.toList());
		//List<String> prodslistNamesLessthan100 =prodslist.stream().filter(p->p.getProductPrice()<100).forEach(p->System.out.println(p.getProductName()));

		List<Double> prodslistPriceMorthan100 = prodslist.stream().filter(p->p.getProductPrice()>=100).map(p->p.getProductPrice()).collect(Collectors.toList());
	//	System.out.println(prodslistPriceMorthan100);
		//System.out.println(prodslistPriceMorthan100);
		double totalSumOfProducts=prodslist.stream().collect(Collectors.summingDouble(p->p.getProductPrice()));
		System.out.println(totalSumOfProducts);
		Product highestPriceProduct=prodslist.stream().max((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).get();
		System.out.println(highestPriceProduct);
		Product lowestPriceProduct=prodslist.stream().min((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).get();
		System.out.println(lowestPriceProduct.getProductName());
		
	}

}
