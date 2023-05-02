package JavaTree.moimmoim.repository;


import JavaTree.moimmoim.domain.ProfileDo;
import JavaTree.moimmoim.domain.UserDo;

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
