package javatreeex.moimmoimex.mapper;

import javatreeex.moimmoimex.domain.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE USER_ID=#{userId} AND PASSWORD=#{userPassword}")
    UserDo getUserByCredentials(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
