package koo.bonun.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostRestController {
    private static final Logger logger = LoggerFactory.getLogger(PostRestController.class);
    private  final PostService postService;
    //    private final List<PostDto> postList;

    public PostRestController(
            @Autowired PostService postService
    ){
          this.postService =postService;
//        this.postList = new ArrayList<>();
    }

    // http://localhost:8080/post
    // POST/post
    //REQUEST_BODY
    //포스트 경로에 포스트 요청이 오면 안쪽에 있을 리퀘스트 바디에따라
    // 포스트 게시글을 만들어 내야한다
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@RequestBody PostDto postDto){
        logger.info(postDto.toString());
        this.postService.createPost(postDto);
        //this.postList.add(postDto);
    }
    // http://localhost:8080/post
    // GET/post

    @GetMapping()
    public List<PostDto> readPostAll(){
        logger.info("in read post all");
        return this.postService.readPostAll();
    }
    //GET /post/0/
    //GET /post?id=0
    @GetMapping("{id}")
    public PostDto readPost(@PathVariable("id")int id){
        logger.info("in read post");
        return this.postService.readPost(id);
    }
    //새로운 것을 만들땐 포스트 매핑
    //대체할때는 풋매핑
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(
            @PathVariable("id") int id,
            @RequestBody PostDto postDto
    ){
        logger.info("target id"  + id);
        logger.info("update content"  + postDto);
        this.postService.updatePost(id, postDto);

//        PostDto targetPost = this.postList.get(id);
//        if(postDto.getTitle() != null){
//            targetPost.setTitle(postDto.getTitle());
//        }
//        if(postDto.getContent() != null){
//            targetPost.setContent(postDto.getContent());
//        }
//        this.postList.set(id, targetPost);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePost(@PathVariable("id")int id){
        this.postService.deletePost(id);
        //this.postList.remove(id);
    }
    //POST/post
    //GET/post/0/
    //GET/post
    //PUT/post/0/
    //DElETE/post/0
//특정한 자원에 대한 요청을 원하면 자원에 해당하는 아이디 적용

// 게시판에 대한 내용
    //POST/board/create
    //GET/board/0/
    //GET/board
    //PUT/board/0/
    //DElETE/board/0
}


