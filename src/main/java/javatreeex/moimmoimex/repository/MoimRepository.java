package JavaTree.moimmoim.repository;


import JavaTree.moimmoim.domain.MoimDo;

import java.util.List;

public interface MoimRepository {

    MoimDo save(MoimDo moim);
    List<MoimDo> findByUserIdNum(Long userIdNum);

    //    Optional<MoimDo> findByName(String name);
    //    List<MoimDo> findAll();
    //    List<MoimDo> findByHostId(Long userId);
}
