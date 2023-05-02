package JavaTree.moimmoim.domain;


import java.time.LocalDate;

/**
 * Profile 테이블 정보 가져옴
 * */
public class ProfileDo {

    private Long userIdNum;
    private String userProfileImage = "default url";
    private String userIntroduction;
    private Double userMoimReviewScoreAvg;
    private int userHostingCount;
    private LocalDate userBirth;

    public ProfileDo(Long userIdNum, String userProfileImage, String userIntroduction, Double userMoimReviewScoreAvg, int userHostingCount, LocalDate userBirth) {
        this.userIdNum = userIdNum;
        this.userProfileImage = userProfileImage;
        this.userIntroduction = userIntroduction;
        this.userMoimReviewScoreAvg = userMoimReviewScoreAvg;
        this.userHostingCount = userHostingCount;
        this.userBirth = userBirth;
    }

    public Long getUserIdNum() {
        return userIdNum;
    }

 /*
    public void setUserIdNum(Long userIdNum) {
        this.userIdNum = userIdNum;
    }
 */

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    public Double getUserMoimReviewScoreAvg() {
        return userMoimReviewScoreAvg;
    }

    public void setUserMoimReviewScoreAvg(Double userMoimReviewScoreAvg) {
        this.userMoimReviewScoreAvg = userMoimReviewScoreAvg;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(LocalDate userBirth) {
        this.userBirth = userBirth;
    }

    public int getUserHostingCount() {
        return userHostingCount;
    }

    public void setUserHostingCount(int userHostingCount) {
        this.userHostingCount = userHostingCount;
    }
}
