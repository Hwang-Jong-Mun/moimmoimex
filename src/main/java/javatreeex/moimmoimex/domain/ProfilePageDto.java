package JavaTree.moimmoim.domain;

import java.util.List;

/**
* 회원번호, 이름, 프로필 사진, 자기소개, 모임 횟수, 년생, 가입일, 리뷰, 모임, 관심있는
* */
public class ProfilePageDto {
    private final UserProfileDto userProfile;
    private final String introduction;
    private final List<MoimDo> userMoimList;
    private final List<ReviewDo> userReviewList;

    public ProfilePageDto(UserProfileDto userProfile, String introduction, List<MoimDo> userMoimList, List<ReviewDo> userReviewList) {
        this.userProfile = userProfile;
        this.introduction = introduction;
        this.userMoimList = userMoimList;
        this.userReviewList = userReviewList;
    }

    public UserProfileDto getUserProfile() {
        return userProfile;
    }

    public String getIntroduction() {
        return introduction;
    }

    public List<MoimDo> getUserMoimList() {
        return userMoimList;
    }

    public List<ReviewDo> getUserReviewList() {
        return userReviewList;
    }
}
