/*
package javatreeex.moimmoimex.service;

import javatreeex.moimmoimex.domain.ProfileDo;
import javatreeex.moimmoimex.domain.UserDo;
import javatreeex.moimmoimex.domain.UserProfileDto;
import javatreeex.moimmoimex.repository.ProfileRepository;
import javatreeex.moimmoimex.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileAssembler {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;

    //생성자 주입
    public UserProfileAssembler(UserRepository userRepository, ProfileRepository profileRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
    }

    public UserProfileDto getUserProfile(Long userIdNum) {
        UserDo userDo = userRepository.findByUserIdNum(userIdNum);
        ProfileDo profileDo = profileRepository.findByUserIdNum(userIdNum);

        // Do 객체에서 필요한 정보를 가져와서 Dto 객체에 값을 넣어줍니다.
        UserProfileDto userProfileDto = new UserProfileDto(
                userDo.getUserIdNum(),
                userDo.getUserName(),
                userDo.getUserNickname(),
                profileDo.getUserProfileImage(),
                profileDo.getUserMoimReviewScoreAvg(),
                profileDo.getUserHostingCount(),
                profileDo.getUserBirth(),
                userDo.getUserEmail(),
                userDo.getCreateDate(),
                userDo.getPhoneNum()
        );

        return userProfileDto;
    }

}
*/
