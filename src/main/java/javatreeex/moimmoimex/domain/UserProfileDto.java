package JavaTree.moimmoim.domain;

import java.time.LocalDate;

public class UserProfileDto {
    private final Long userIdNum;
    private final String userName;
    private final String userNickName;
    private final String userProfileImage;
    private final Double userMoimReviewScoreAvg;
    private final Integer userHostingCount;
    private final LocalDate userBirth;
    private final String userEmail;
    private final LocalDate userCreateDate;
    private final int userFavoriteCategory;

    public UserProfileDto(Long userIdNum, String userName, String userNickName, String userProfileImage, Double userMoimReviewScoreAvg, Integer userHostingCount, LocalDate userBirth, String userEmail, LocalDate userCreateDate, int userFavoriteCategory) {
        this.userIdNum = userIdNum;
        this.userName = userName;
        this.userNickName = userNickName;
        this.userProfileImage = userProfileImage;
        this.userMoimReviewScoreAvg = userMoimReviewScoreAvg;
        this.userHostingCount = userHostingCount;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
        this.userCreateDate = userCreateDate;
        this.userFavoriteCategory = userFavoriteCategory;
    }

    public Long getUserIdNum() {
        return userIdNum;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public Double getUserMoimReviewScoreAvg() {
        return userMoimReviewScoreAvg;
    }

    public Integer getUserHostingCount() {
        return userHostingCount;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public LocalDate getUserCreateDate() {
        return userCreateDate;
    }

    public int getUserFavoriteCategory() {
        return userFavoriteCategory;
    }
}
