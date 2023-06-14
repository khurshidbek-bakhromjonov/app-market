package com.market.dto.profile;

import com.market.dto.attachment.PreviewAttachmentDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileInfoDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private PreviewAttachmentDTO photo;
}
