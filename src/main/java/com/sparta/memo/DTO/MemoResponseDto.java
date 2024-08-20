package com.sparta.memo.DTO;

import com.sparta.memo.entity.Memo;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public MemoResponseDto(Memo memo) {
        this.username = memo.getUsername();
        this.contents = memo.getContents();
        this.id = memo.getId();;
        this.createAt = memo.getCreatedAt();
        this.modifiedAt = memo.getModifiedAt();
    }

}