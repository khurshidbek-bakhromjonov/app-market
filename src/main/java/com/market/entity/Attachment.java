package com.market.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "attachment")
public class Attachment {

    @Id
    @GenericGenerator(name = "attachment_uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "origin_name")
    private String originName;

    @Column
    private Long size;

    @Column
    private String type;

    @Column(name = "content_type")
    private String contentType;

    @Column
    private String path;

    @Column
    private Double duration;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
}
