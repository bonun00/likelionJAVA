package koo.bonun.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostInMemoryRepository implements PostRepository {
    private static  final Logger logger = LoggerFactory.getLogger(PostInMemoryRepository.class);
    private final List<PostDto> postList;


    public PostInMemoryRepository() {
        this.postList = new ArrayList<>();
    }

    @Override
    public boolean save(PostDto dto) {
       return this.postList.add(dto);

    }

    @Override
    public List<PostDto> findAll() {
        return this.postList;
    }

    @Override
    public PostDto findById(int id) {
        return this.postList.get(id);
    }

    @Override
    public boolean update(int id,PostDto postDto) {
        PostDto targetPost = this.postList.get(id);
        if(postDto.getTitle() != null){
            targetPost.setTitle(postDto.getTitle());
        }
        if(postDto.getContent() != null){
            targetPost.setContent(postDto.getContent());
        }
        this.postList.set(id, targetPost);
        return true;
    }

    @Override
    public PostDto delete(int id) {
        return this.postList.remove(id);

    }
}
