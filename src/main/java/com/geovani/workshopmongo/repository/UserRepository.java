package com.geovani.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.geovani.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
