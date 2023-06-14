package com.market.dto.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeResponseDTO {

    private Long id;
    private String imageUrl;
    private String name;
    private Long categoryId;
}