package javatreeex.moimmoimex.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    // private Long userIdentificationNum;

    private int phoneNum;
    private String birth; // 생년월일 문자열로 받음
    private int categoryNum;
    private int hostLevelNum;
    private String location;
    private Date createDate;


    /*
    private String userPhoneNumber;
    private int userFavoriteCategoryNum;
    private int userLocationNum;
    private String userCategory;
    private Integer userHostLevel;
    private LocalDate userCreateDate;*/
}
