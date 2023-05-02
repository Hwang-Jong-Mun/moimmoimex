package javatreeex.moimmoimex.repository;


import javatreeex.moimmoimex.domain.ProfileDo;
import javatreeex.moimmoimex.domain.UserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    UserDo save(UserDo user);
    UserDo findByUserIdNum(Long userIdNum);
    List<UserDo> findAll();
//
//    UserDo findByUserId(Long userId);
//
    ProfileDo findProfileByUserIdNum(Long userIdNum);
}
