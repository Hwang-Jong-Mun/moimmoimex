package JavaTree.moimmoim.domain;


import java.time.LocalDate;

/**
 * USERS 테이블 정보 / 필수정보들
 * */
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

    public UserDo(Long userIdNum, String userId, String userEmail, String userPassword, String userName, String userNickname, String userPhoneNumber, Long userIdentificationNum, int favoriteCategoryNum, int userLocationNum, String userCategory, Integer userHostLevel, LocalDate userCreateDate) {
        this.userIdNum = userIdNum;
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userPhoneNumber = userPhoneNumber;
        this.userIdentificationNum = userIdentificationNum;
        this.userFavoriteCategoryNum = userFavoriteCategoryNum;
        this.userLocationNum = userLocationNum;
        this.userCategory = userCategory;
        this.userHostLevel = userHostLevel;
        this.userCreateDate = userCreateDate;
    }

    public Long getUserIdNum() {
        return userIdNum;
    }

    public void setUserIdNum(Long userIdNum) {
        this.userIdNum = userIdNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public Long getUserIdentificationNum() {
        return userIdentificationNum;
    }

    public void setUserIdentificationNum(Long userIdentificationNum) {
        this.userIdentificationNum = userIdentificationNum;
    }

    public int getUserFavoriteCategoryNum() {
        return userFavoriteCategoryNum;
    }

    public void setUserFavoriteCategoryNum(int favoriteCategoryNum) {
        this.userFavoriteCategoryNum = favoriteCategoryNum;
    }

    public int getUserLocationNum() {
        return userLocationNum;
    }

    public void setUserLocationNum(int userLocationNum) {
        this.userLocationNum = userLocationNum;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public Integer getUserHostLevel() {
        return userHostLevel;
    }

    public void setUserHostLevel(Integer userHostLevel) {
        this.userHostLevel = userHostLevel;
    }

    public LocalDate getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(LocalDate userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
}
