package javatreeex.moimmoimex.mapper;

import javatreeex.moimmoimex.domain.UserProfileDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserProfileMapper {
    UserProfileDto getUserProfileDto(Long userIdNum);
}
