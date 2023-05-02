package javatreeex.moimmoimex.mapper;

import javatreeex.moimmoimex.domain.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserDo getUserByCredentials(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
