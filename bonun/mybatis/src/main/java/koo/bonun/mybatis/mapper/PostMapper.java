package koo.bonun.mybatis.mapper;

import koo.bonun.mybatis.dto.PostDto;

import java.util.List;

public interface PostMapper {
    int createPost(PostDto dto);
    int createPostAll(List<PostDto>dtoList);
//XMl의 아이디와 함수명과 일치하고 mapper 클래스와
//인터페이스와 일치하면 이 인터페이스는 xml 파일을 상징하게된다

    PostDto readPost(int id);
    List<PostDto> readPostAll();
    PostDto readPostQuery (PostDto dto);
    int updatePost(PostDto dto);
    int deletePost (int id);

}
