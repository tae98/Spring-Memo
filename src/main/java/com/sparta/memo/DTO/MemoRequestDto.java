package com.sparta.memo.DTO;

import com.sparta.memo.entity.Memo;
import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String contents;

}