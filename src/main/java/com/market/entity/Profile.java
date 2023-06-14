package com.market.entity;

import com.market.enums.ProfileRole;
import com.market.enums.ProfileStatus;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Embeddable
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String phone;

    @Column
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column
    @Enumerated(value = EnumType.STRING)
    private ProfileStatus status = ProfileStatus.NOT_ACTIVE;

    @Column
    @Enumerated(value = EnumType.STRING)
    private ProfileRole role;

    @Column(name = "photo_id")
    private String photoId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "photo_id", insertable = false, updatable = false)
    private Attachment photo;

    @Column(name = "firebase_token")
    @ElementCollection
    private List<String> firebaseTokens = new ArrayList<>();

    @Column
    private Boolean visible = true;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    public void addFireBaseToken(String firebaseToken) {
        firebaseTokens.add(firebaseToken);
    }

}
