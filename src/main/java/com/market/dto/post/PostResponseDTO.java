package com.market.dto.post;

import com.market.enums.Currency;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PostResponseDTO {

    private Long id;
    private Long typeId;
    private String title;
    private Double price;
    private Currency currency;
    private String phone;
    private String location;
    private String description;
    private List<String> attachmentLinks;
    private Long profileId;
    private Long likeCount;
    private Boolean isLiked;
    private LocalDateTime createdDate;
}
