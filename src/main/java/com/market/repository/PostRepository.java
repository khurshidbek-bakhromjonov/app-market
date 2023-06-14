package com.market.repository;


import com.market.entity.Post;
import com.market.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>, PagingAndSortingRepository<Post, Long> {

    Optional<Post> findByIdAndVisibleTrue(Long id);

    Page<Post> findByVisibleTrueOrderByCreatedDateDescLikeCountDesc(Pageable pageable);
    Page<Post> findByVisibleTrueAndTypeCategoryTypeOrderByCreatedDateDescLikeCountDesc(Pageable pageable, Type type);
    Page<Post> findByVisibleTrueAndProfileIdAndTypeCategoryTypeOrderByCreatedDateDescLikeCountDesc(Pageable pageable, Long profileId, Type type);
}