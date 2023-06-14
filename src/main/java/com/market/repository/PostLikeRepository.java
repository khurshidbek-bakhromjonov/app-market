package com.market.repository;


import com.market.entity.PostLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostLikeRepository extends CrudRepository<PostLike, Long>, PagingAndSortingRepository<PostLike, Long> {
    Optional<PostLike> findByPostIdAndProfileId(Long postId, Long profileId);
}