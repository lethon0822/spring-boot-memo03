package com.green.memoprac03_be;

import com.green.memoprac03_be.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int save (MemoPostReq req) {
        return memoMapper.save(req);
    }

    public List<MemoGetRes> findAll (MemoGetReq req) {
        return memoMapper.findAll(req);
    }

    public MemoGetOneRes findById (int id) {
        return memoMapper.findById(id);
    }

    public int modify (MemoPutReq req) {
        return memoMapper.modify(req);
    }

    public int deleteById (int id) {
        return memoMapper.deleteById(id);
    }
}
