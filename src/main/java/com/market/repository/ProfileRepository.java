package com.market.repository;


import com.market.entity.Profile;
import com.market.enums.ProfileStatus;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository extends CrudRepository<Profile, Long>, PagingAndSortingRepository<Profile, Long> {
    Optional<Profile> findByPhone(String phone);

    @Modifying
    @Transactional
    @Query("UPDATE Profile " +
            "set fullName=?2 " +
            "where id=?1")
    int editFullNameById(Long userId, String fullName);


    @Modifying
    @Transactional
    @Query("UPDATE Profile " +
            "set phone=?2 " +
            "where id=?1")
    int updatePhoneById(Long userId, String phone);

    @Modifying
    @Transactional
    @Query("UPDATE Profile " +
            "set status=?2 " +
            "where id=?1")
    int updateStatus(Long userId, ProfileStatus notActive);

    @Modifying
    @Transactional
    @Query("UPDATE Profile " +
            "set email=?2 " +
            "where id=?1")
    int updateEmailById(Long userId, String email);

    @Modifying
    @Transactional
    @Query("UPDATE Profile " +
            "set photoId=?2 " +
            "where id=?1")
    int updatePhotoIdById(Long userId, String photoId);


    @Query("select firebaseTokens from Profile " +
            "where visible=true ")
    List<List<String>> getFirebaseTokens();
}