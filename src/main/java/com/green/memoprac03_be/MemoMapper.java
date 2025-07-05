package com.green.memoprac03_be;

import com.green.memoprac03_be.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq req);
    List<MemoGetRes> findAll (MemoGetReq req);
    MemoGetOneRes findById(int id);
    int modify(MemoPutReq req);
    int deleteById(int id);
}
