package com.market.dto.auth;

import com.market.enums.ProfileRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthResponseDTO {

    private ProfileRole role;
    private String accessToken;
    private String refreshToken;
}
