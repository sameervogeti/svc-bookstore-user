package com.bookstore.user.repository;

import com.bookstore.user.model.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User,Integer>
{
    User finduserByEmail(String email);
    User finduserByEmailandPassword(String email,String password);
}
