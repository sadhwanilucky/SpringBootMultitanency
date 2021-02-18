package se.callista.blog.service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.callista.blog.service.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	@Query("SELECT p from Product p WHERE p.id = :id")
    Optional<Product> findById(long id);
	
	@Query("SELECT p from Product p ")
    List<Product> findAll();

}