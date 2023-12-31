package com.market.dto.email;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SMSHistoryResponseDTO {

    private Integer id;
    private String phone;
    private String message;
    private LocalDateTime createdDate;
}
