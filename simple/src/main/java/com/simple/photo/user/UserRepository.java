package com.simple.photo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
//@NoRepositoryBean
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
