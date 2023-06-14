package com.market.dto.type;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeCreateDTO {
    @NotBlank(message = "name cannot be blank")
    private String name;

    @NotBlank(message = "attachmentId cannot be blank")
    private String attachmentId;

    @Positive(message = "Invalid categoryId")
    private Long categoryId;
}