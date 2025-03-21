package tech.studyproject.spring_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.studyproject.spring_app.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	

}
