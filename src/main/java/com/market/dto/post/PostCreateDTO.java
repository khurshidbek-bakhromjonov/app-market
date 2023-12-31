package com.market.dto.post;

import com.market.enums.Currency;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostCreateDTO {

    @Positive(message = "TypeId cannot be negative")
    private Long typeId;

    private List<String> attachmentIdList;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Positive(message = "Price cannot be negative")
    private Double price;

    @NotBlank(message = "Currency cannot be blank")
    private Currency currency;

    @NotBlank(message = "Phone cannot be blank")
    private String phone;

    @NotBlank(message = "Location cannot be blank")
    private String location;

    @NotBlank(message = "Description cannot be blank")
    private String description;
}
