package Api.com.dragonball.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Api.com.dragonball.entity.Dragonball;

public interface IDragonBallRepository extends JpaRepository<Dragonball, Integer> {

}
