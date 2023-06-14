package com.market.repository;


import com.market.entity.Category;
import com.market.entity.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>, PagingAndSortingRepository<Category, Long> {
    List<Category> findByTypeOrderById(Type type);
}