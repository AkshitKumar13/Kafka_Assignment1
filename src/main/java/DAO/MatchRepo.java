package DAO;

import org.springframework.data.repository.CrudRepository;

public interface MatchRepo extends CrudRepository<MatchModel, Long> {

     String findByResult();
}
