package javatreeex.moimmoimex.repository;

import javatreeex.moimmoimex.domain.ReviewDo;

import java.util.List;


public interface ReviewRepository {
    ReviewDo save(ReviewDo review);
    List<ReviewDo> findByUserIdNum(Long userIdNum);

//    Optional<ReviewDo> findByName(String name);
//    List<ReviewDo> findAll();
//    List<ReviewDo> findByHostId(Long userIdNum);
}
