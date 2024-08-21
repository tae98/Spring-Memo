package com.sparta.memo.Controller;

import com.sparta.memo.DTO.MemoRequestDto;
import com.sparta.memo.DTO.MemoResponseDto;
import com.sparta.memo.service.MemoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemoController {
    //jdbc Template 선언
    private final MemoService memoService;
    //Jdbc 생성자 선언‚‚
    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @PostMapping("/memos")
    public MemoResponseDto createMemo(@RequestBody MemoRequestDto requestDto) {

        return memoService.createMemo(requestDto);
    }

    @GetMapping("/memos")
    public List<MemoResponseDto> getMemos() {
        return memoService.getMemos();
    }

    @PutMapping("/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.updateMemo(id, requestDto);
    }

    @DeleteMapping("/memos/{id}")
    public Long deleteMemo(@PathVariable Long id) {
        return memoService.deleteMemo(id);
    }

    @GetMapping("/memos/contents")
    public List<MemoResponseDto> getMemosByKeyword(@RequestParam String keyword){
        return memoService.getMemosByKeyword(keyword);
    }
}