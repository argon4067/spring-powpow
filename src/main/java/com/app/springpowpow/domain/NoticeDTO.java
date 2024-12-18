package com.app.springpowpow.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@Data
public class NoticeDTO {
    private Long id;
    private Long memberId;
    private String noticeTitle;
    private String noticeContent;
    private String noticeDate;
    private Long noticeCount;
    private String memberEmail;
    private String memberPassword;
    private String memberPhone;
    private String memberName;
}
