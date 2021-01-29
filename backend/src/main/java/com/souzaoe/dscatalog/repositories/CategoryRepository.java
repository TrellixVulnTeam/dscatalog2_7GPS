package com.souzaoe.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souzaoe.dscatalog.entities.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Product, Long> {
	

}
