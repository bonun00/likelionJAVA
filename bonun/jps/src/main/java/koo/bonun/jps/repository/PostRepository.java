package koo.bonun.jps.repository;

import koo.bonun.jps.entitiy.BoardEntity;
import koo.bonun.jps.entitiy.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity,Long> {
    List<PostEntity> findAllByWriter(String writer); // where writer =?
    //id가아닌 다른것을 가지고 찾을려고할대

    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity boardEntity);
    // where writer =? and board_entity_id=?
    List<PostEntity> findAllByWriterContaining(String writer);
    //writer의 내용을 포함한 것을 찾아준다
}
