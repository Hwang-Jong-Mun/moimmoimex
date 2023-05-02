package javatreeex.moimmoimex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
* 회원번호, 이름, 프로필 사진, 자기소개, 모임 횟수, 년생, 가입일, 리뷰, 모임, 관심있는
* */
@Data
@AllArgsConstructor
public class ProfilePageDto {
    private final UserProfileDto userProfile;
    private final String introduction;
    private final List<MoimDo> userMoimList;
    private final List<ReviewDo> userReviewList;
}
