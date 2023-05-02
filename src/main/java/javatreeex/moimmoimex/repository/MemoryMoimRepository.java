package javatreeex.moimmoimex.repository;

import javatreeex.moimmoimex.domain.MoimDo;
import javatreeex.moimmoimex.domain.UserDo;

import java.util.HashMap;
import java.util.Map;

public class MemoryMoimRepository {
    private static Map<Long, MoimDo> moimList = new HashMap<>();

/*
    private static long sequence = 0L; //moimNum

    public MoimDo save(MoimDo moim){
        moim.setMoimNum(++sequence);
        moimList.put(moim.getMoimNum(), moim);
        return moim;
    }
*/


}
