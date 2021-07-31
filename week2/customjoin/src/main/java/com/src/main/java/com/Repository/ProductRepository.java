package com.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.entities.ProductJoin;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query("select new com.demo.entities.ProductJoin(p.id, p.name, p.price, p.category.id, p.category.name) from Product p, Category c where p.category = c")
	public List<ProductJoin> join();

}
