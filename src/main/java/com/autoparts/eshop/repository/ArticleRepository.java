package com.autoparts.eshop.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.autoparts.eshop.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {
	
	@EntityGraph(attributePaths = {"categories", "brands" })
	List<Article> findAllEagerBy();	
		
	@EntityGraph(attributePaths = {"categories", "brands" })
	Optional<Article> findById(Long id);
	

	
	@Query("SELECT DISTINCT c.name FROM Category c")
	List<String> findAllCategories();
	
	@Query("SELECT DISTINCT b.name FROM Brand b")
	List<String> findAllBrands();
	
}
