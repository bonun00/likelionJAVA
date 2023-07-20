package koo.bonun.mybatis;

import koo.bonun.mybatis.dao.BoardDao;
import koo.bonun.mybatis.dao.PostDao;
import koo.bonun.mybatis.dto.BoardDto;
import koo.bonun.mybatis.dto.PostDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    private final PostDao postDao;
    private final BoardDao boardDao;

    public TestComponent(
            @Autowired PostDao postDao,
            @Autowired BoardDao boardDao
    ){
        this.postDao=postDao;
        this.boardDao=boardDao;


        BoardDto boardDto =new BoardDto();
        boardDto.setName("new board");
        this.boardDao.createBoard(boardDto);
        System.out.println(boardDto.getId());
    }

    public PostDao getPostDao() {
        return postDao;
    }
}
