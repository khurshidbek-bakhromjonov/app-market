package com.market.dto.profile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.market.enums.ProfileRole;
import com.market.enums.ProfileStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileResponseDTO {

    private Long id;
    private String fullName;
    private String phone;
    private ProfileStatus status;
    private ProfileRole role;
    private Boolean visible;
    private String photoId;
    private LocalDateTime createdDate;
}
