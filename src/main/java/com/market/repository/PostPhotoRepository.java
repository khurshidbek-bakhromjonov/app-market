package com.market.repository;


import com.market.entity.PostPhoto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostPhotoRepository extends CrudRepository<PostPhoto, Long>, PagingAndSortingRepository<PostPhoto, Long> {

    List<PostPhoto> findByPostId(Long postId);

    Optional<PostPhoto> findByPostIdAndAttachmentId(Long postId, String attachId);

    @Transactional
    @Modifying
    void deleteByPostId(Long postId);
}