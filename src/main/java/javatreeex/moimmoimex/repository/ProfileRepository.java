package javatreeex.moimmoimex.repository;

import javatreeex.moimmoimex.domain.ProfileDo;


public interface ProfileRepository {

    ProfileDo save(ProfileDo profileDo);
    ProfileDo findByUserIdNum(Long userIdNum);
}
