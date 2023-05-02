package javatreeex.moimmoimex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
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

}
