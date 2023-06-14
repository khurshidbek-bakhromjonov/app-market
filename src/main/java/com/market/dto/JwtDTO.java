package com.market.dto;

import com.market.enums.ProfileRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtDTO {

    private Integer id;
    private String phone;
    private ProfileRole role;

    public JwtDTO(String phone, ProfileRole role) {
        this.phone = phone;
        this.role = role;
    }
}
