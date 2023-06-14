package com.market.repository;

import com.market.entity.SMSHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface SMSHistoryRepository extends CrudRepository<SMSHistory, Integer>, PagingAndSortingRepository<SMSHistory, Integer> {

    List<SMSHistory> findByPhone(String phone);

    @Query(value = "SELECT * from phone_history e where to_date(to_char(e.created_date, 'YYYY/MM/DD'), 'YYYY/MM/DD')=?1", nativeQuery = true)
    List<SMSHistory> findByCreatedDate(LocalDate createdDate);

    long countByPhoneAndCreatedDateBetween(String email, LocalDateTime fromDate, LocalDateTime toDate);

    Page<SMSHistory> findByPhoneOrderByCreatedDateDesc(String phone, Pageable pageable);
}