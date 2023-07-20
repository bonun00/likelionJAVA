package koo.bonun.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
//@RequestMapping("post")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;
    public PostController(
            @Autowired PostService postService
    ){
        this.postService = postService;
    }
        @PostMapping("create")
        public void createPost(@RequestBody PostDto postDto) {
            logger.info(postDto.toString());
            this.postService.createPost(postDto);
        }

        @GetMapping("read-all")
        public List<PostDto> readPostAll(){
            logger.info("in read all");
            return this.postService.readPostAll();
        }

        @GetMapping("read-one")
        public PostDto readPostOne(@RequestParam("id") int id){
            logger.info("in read one");
            return this.postService.readPost(id);
        }
        @PostMapping("update")
        public void updatePost (
                @RequestParam("id")int id,
                @RequestBody PostDto postDto
        ){
            logger.info("target id"  + id);
            logger.info("update content"  + postDto);
            this.postService.updatePost(id, postDto);

//            PostDto targetPost = this.postlist.get(id);
//            if(postDto.getTitle() != null){
//                targetPost.setTitle(postDto.getTitle());
//            }
//            if(postDto.getContent() != null){
//                targetPost.setContent(postDto.getContent());
//            }
//            this.postlist.set(id, targetPost);
    }

    @DeleteMapping("delete")
    public void deletePost(@RequestParam("id") int id){
        this.postService.deletePost(id);
    }

}