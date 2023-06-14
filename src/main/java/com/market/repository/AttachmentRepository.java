package com.market.repository;

import com.market.entity.Attachment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttachmentRepository extends CrudRepository<Attachment, String>, PagingAndSortingRepository<Attachment, String> {
}
