//package koo.bonun.jps;
//
//import koo.bonun.jps.entitiy.BoardEntity;
//import koo.bonun.jps.entitiy.PostEntity;
//import koo.bonun.jps.repository.BoardRepository;
//import koo.bonun.jps.repository.PostRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestComponent {
//    public  TestComponent(
//            @Autowired BoardRepository boardRepository,
//            @Autowired PostRepository postRepository
//    ){
//        BoardEntity boardEntity = new BoardEntity();
//        boardEntity.setName("new board");
//        BoardEntity newBoardEntity = boardRepository.save(boardEntity);
//        //System.out.println(newBoardEntity.getName());
//
//        PostEntity postEntity = new PostEntity();
//        postEntity.setTitle("hello ORM");
//        postEntity.setContent("this Entity is created by hibernate!");
//        postEntity.setWriter("bonun");
//        postEntity.setBoardEntity(newBoardEntity);
//        PostEntity newPostEntity = postRepository.save(postEntity);
//
//        System.out.println(postRepository.findAllByWriter("bonun").size());
//
//
//    }
//}
