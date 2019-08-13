package com.zensar.spring.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("DbConfig.xml");
       //Product product = new Product(1001,"Laptop","HP",50000.0);
        ProductService service =ctx.getBean("productServiceImpl",ProductService.class);
      //  service.create(product);
		
		/*
		 * product=service.findProductbyId(1001); System.out.println(product);
		 * service.edit(product); Product product1 =new
		 * Product(1001,"Laptop","HP",50000.0); service.edit(product1);
		 */
		 
		 
		  
        
		
		
		/*
		 * Product product2 =new Product(); product2.setProductId(1001); //
		 * service.remove(product2);
		 */
		 
		       
		
		
		  List<Product> productList= service.findAllProducts(); for(Product
		  p:productList) System.out.println(p);
		 
		 
    }
}
