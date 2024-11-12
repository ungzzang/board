package com.green.board;
/*
    src > main > resource > mappers 폴더 아래에 이름이 같은 xml파일을 만든다.
    (사실 똑같은 이름을 할 필요는 없으나 관리상 용이하게 하기 위해 같은 이름을 쓴다.)

    xml + interface 파일을 이용해서 implements한 class파일을 만들 것이고 빈등록까지 해준다.
    스프링 컨테이너가 빈등록한 class파일을 객체화 할 것이다.
    여기서 만든 주소값을 BoardService 객체화 할 때 DI해준다.

    insert, update, delete의 리턴타입은 int하면 됨.
 */

import com.green.board.model.BoardInsReq;
import com.green.board.model.BoardSelOneRes;
import com.green.board.model.BoardSelRes;
import com.green.board.model.BoardUpdReq;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper // MyBatis에서 쓰는 애노테이션, Dao 만들때쓰는 녀석, 선언부에 있다
public interface BoardMapper {
    int insBoard(BoardInsReq p);
    List<BoardSelRes> selBoardList();
    BoardSelOneRes selBoardOne(int p);
    int updBoard(BoardUpdReq p); // insert, update, delete는 int쓴다.
}

// 선언부와 쿼리문만 있으면 boardDao 같은거 만들어줌