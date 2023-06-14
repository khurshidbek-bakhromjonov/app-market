package com.market.repository;


import com.market.entity.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long>, PagingAndSortingRepository<Type, Long> {

    List<Type> findByCategoryIdOrderById(Long categoryId);
}