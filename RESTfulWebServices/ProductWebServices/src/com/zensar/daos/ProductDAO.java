package com.zensar.daos;
 
import java.util.List;
 
import com.zensar.entities.Product;
 
/*
 * Author: SHIVAM SHUKLA
 * Creation Date: 26th July 2019 10.00AM
 * Modified Date: 26th July 2019 10.00AM
 * Version: 1.0
 * Copyright: Zensar Technologies. Alll rights reserved. 
 * Description: Data Access Object Interface.
 * It is used to access Product Data from Database. 
 * */
public interface ProductDAO {
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
