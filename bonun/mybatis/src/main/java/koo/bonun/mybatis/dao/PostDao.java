package koo.bonun.mybatis.dao;

import koo.bonun.mybatis.dto.PostDto;
import koo.bonun.mybatis.mapper.PostMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
//데이터를 주고받기위한 클래스라는 것을 보여줌

@Repository
public class PostDao {
    private final SqlSessionFactory sessionFactory;

    public PostDao(
            @Autowired SqlSessionFactory sessionFactory
    ){
        this.sessionFactory = sessionFactory;
    }
    public int createPost(PostDto dto){
        try (SqlSession session = sessionFactory.openSession()){
            PostMapper mapper =session.getMapper(PostMapper.class);
            return mapper.createPost(dto);
            //try 사용하면 세션이 자동으로 close가 된다
        }

//        SqlSession session = sessionFactory.openSession();
//        PostMapper mapper =session.getMapper(PostMapper.class);
//        int rowAffected = mapper.createPost(dto);
//        session.close();
//        return rowAffected;
    }
    public PostDto readPost(int id){
        try (SqlSession session = sessionFactory.openSession()){
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.readPost(id);
            //세션을 열고닫는 이유 mapper은 요청이 두번들어왔을때
            //함수에 다른함수가 영향을 줄수 있기때문
        }
    }

    public List<PostDto> readPostAll(){
        try (SqlSession session = sessionFactory.openSession()){
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.readPostAll();
        }
    }

    public int updatePost(PostDto dto){
        try (SqlSession session = sessionFactory.openSession()){
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.updatePost(dto);
        }
    }

    public int deletePost(int id){
        try (SqlSession session = sessionFactory.openSession()){
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.deletePost(id);
        }
    }

}
