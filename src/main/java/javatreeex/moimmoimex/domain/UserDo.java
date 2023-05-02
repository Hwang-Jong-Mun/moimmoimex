package javatreeex.moimmoimex.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * USERS 테이블 정보 / 필수정보들
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDo {
    private Long userIdNum;
    private String userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userPhoneNumber;
    private Long userIdentificationNum; // 주민등록번호 null 대비 일부러 Long. long x
    private int userFavoriteCategoryNum;
    private int userLocationNum;
    private String userCategory;
    private Integer userHostLevel;
    private LocalDate userCreateDate;
}
