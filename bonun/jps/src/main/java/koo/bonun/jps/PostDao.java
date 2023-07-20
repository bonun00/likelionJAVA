package koo.bonun.jps;

import koo.bonun.jps.entitiy.PostEntity;
import koo.bonun.jps.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.Iterator;
import java.util.Optional;

@Repository
public class PostDao {
    private static final Logger logger = LoggerFactory.getLogger(PostDao.class);
    private final PostRepository postRepository;

    public PostDao(
            @Autowired PostRepository postRepository
    ) {

        this.postRepository = postRepository;
    }

    public void createPost(PostDto dto) {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(dto.getTitle());
        postEntity.setContent(dto.getContent());
        postEntity.setWriter(dto.getWriter());
        postEntity.setBoardEntity(null);
        PostEntity target = this.postRepository.save(postEntity);

    }

    public PostEntity readPost(int id) {
        Optional<PostEntity> postEntity = this.postRepository.findById((long) id);
        if (postEntity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return postEntity.get();
    }

    public Iterator<PostEntity> readPostAll() {
        return this.postRepository.findAll().iterator();

    }

    public void updatePost(int id, PostDto dto) {
        Optional<PostEntity> targetEntity =this.postRepository.findById(Long.valueOf(id));
        if(targetEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        PostEntity postEntity =targetEntity.get();
        postEntity.setTitle
                (dto.getTitle() == null ? postEntity.getTitle() : dto.getTitle());
        postEntity.setContent
                (dto.getContent() == null ? postEntity.getContent() : dto.getContent());
        postEntity.setWriter
                (dto.getWriter() == null ? postEntity.getWriter() : dto.getWriter());
        // 널이면원래의 타이틀 아니면 받아오는 타이틀
        this.postRepository.save(postEntity);

    }

    public void deletePost(int id) {
        Optional<PostEntity> targetEntity = this.postRepository.findById((long) id);
        //        this.postRepository.deleteById((long)id);
        if (targetEntity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.postRepository.delete(targetEntity.get());
    }
}


