package com.green.memoprac03_be;

import com.green.memoprac03_be.config.model.ResultResponse;
import com.green.memoprac03_be.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("green/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public ResultResponse<Integer> save(@RequestBody MemoPostReq req) {
        int result  = memoService.save(req);
        return new ResultResponse<>("삽입 성공", result);
    }

    @GetMapping
    public ResultResponse<List<MemoGetRes>> findAll (@ModelAttribute MemoGetReq req) {
        List<MemoGetRes> result  = memoService.findAll(req);
        String message = String.format("rows: %d", result.size());
        return new ResultResponse<>(message, result);
    }

    @GetMapping("/{id}")
    public ResultResponse<MemoGetOneRes> findById (@PathVariable int id) {
        MemoGetOneRes result  = memoService.findById(id);
        return new ResultResponse<>("조회 성공", result);
    }

    @PutMapping
    public ResultResponse<Integer> modify(@RequestBody MemoPutReq req) {
        int result  = memoService.modify(req);
        return new ResultResponse<>("수정 성공", result);
    }

    @DeleteMapping
    public ResultResponse<Integer> delete(@RequestParam int id) {
        int result  = memoService.deleteById(id);
        return new ResultResponse<>("삭제 성공", result);
    }
}