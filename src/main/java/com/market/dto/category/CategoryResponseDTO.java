package com.market.dto.category;

import com.market.entity.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseDTO {

    private Long id;
    private String imageUrl;
    private String name;
    private Type type;
}