package com.green.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardInsReq { //Req는 프론트한테 요청받는다는 느낌으로 쓴거 그냥
    private String title;
    private String contents;
    private String writer;
}


