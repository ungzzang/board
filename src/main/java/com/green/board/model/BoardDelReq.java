package com.green.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardDelReq {

    private int boardId;
    private String writer;
}
