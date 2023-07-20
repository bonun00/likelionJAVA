package koo.bonun.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceSimple implements PostService{
    private  static final Logger logger = LoggerFactory.getLogger(PostServiceSimple.class);
    private final PostRepository postRepository;

    public PostServiceSimple(
            @Autowired PostRepository postRepository
            //Di 해준다 자동으로
    ) {
       this.postRepository = postRepository;
    }

    @Override
    public void createPost(PostDto dto) {
        //투두 check validity
        //게시글 작성 권한 확이누
        // TODO
        if (!this.postRepository.save(dto)){
            throw new RuntimeException("save failed");

            //예시로써 사용
        }

    }

    @Override
    public List<PostDto> readPostAll() {
        return this.postRepository.findAll();
    }

    @Override
    public PostDto readPost(int id) {
        return this.postRepository.findById(id);
    }

    @Override
    public void updatePost(int id, PostDto dto) {
        this.postRepository.update(id, dto);
    }

    @Override
    public void deletePost(int id) {
        this.postRepository.delete(id);
    }
}
