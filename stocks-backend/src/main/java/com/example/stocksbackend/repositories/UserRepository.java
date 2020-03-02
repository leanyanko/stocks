package com.example.stocksbackend.repositories;

import com.example.stocksbackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
}
