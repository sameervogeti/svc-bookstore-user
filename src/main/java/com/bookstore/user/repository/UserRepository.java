package com.bookstore.user.repository;

import com.bookstore.user.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,Integer>
{

}
