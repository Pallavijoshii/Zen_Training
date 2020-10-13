package com.zensar.services.business;
import java.util.ArrayList;
import java.util.List;
/*
* Author: SHIVAM SHUKLA
* Creation Date: 26th July 2019 11.35AM
* Modified Date: 26th July 2019 11.35AM
* Version: 1.0
* Copyright: Zensar Technologies. All rights reserved. 
* Description: Data Access Object Interface.
* It focuses on Business Logic. 
* */
import java.util.List;

import com.zensar.daos.ProductDAO;
import com.zensar.daos.ProductDAOImpl;
import com.zensar.entities.Product;
/*
* Author: SHIVAM SHUKLA
* Creation Date: 26th July 2019 11.22AM
* Modified Date: 26th July 2019 11.22AM
* Version: 1.0
* Copyright: Zensar Technologies. All rights reserved. 
* Description: Data Access Object Interface.
* It interacts with DAO layer to get data from database.
* It also interacts with presentation layer
* to give data as per business requirements. 
* */
public class ProductServiceImpl implements ProductService {
	
	private ProductDAO dao;
	
	public ProductServiceImpl() {
			dao = new ProductDAOImpl();
	}
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null) 
		{
			dbProduct.setName(product.getName());
			dbProduct.setBrand(product.getBrand());
			dbProduct.setPrice(product.getPrice());
			dao.update(dbProduct);
		}
		else 
		{
			System.out.println("Product not found");
		}
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
				if(dbProduct!=null)
					dao.delete(dbProduct);
				else
					System.out.println("Product Not Found !");

	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Product> findProductByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProducts();
		List<Product> pPList = new ArrayList<>();
		for(Product p:pList) {
			if(price<)
		}
	}

}