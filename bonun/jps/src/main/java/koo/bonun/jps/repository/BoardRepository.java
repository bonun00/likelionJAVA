package koo.bonun.jps.repository;

import koo.bonun.jps.entitiy.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity,Long> {

}
