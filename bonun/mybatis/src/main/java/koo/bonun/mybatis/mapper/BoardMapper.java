package koo.bonun.mybatis.mapper;

import koo.bonun.mybatis.dto.BoardDto;

public interface BoardMapper {
    int createBoard(BoardDto dto);
}
