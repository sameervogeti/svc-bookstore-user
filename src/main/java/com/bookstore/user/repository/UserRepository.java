package com.bookstore.user.repository;

import com.bookstore.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends CrudRepository<User,Integer>
{
  User finduserByEmail(@Param("email") String email);
  User finduserByEmailandPassword(@Param("email")String email,@Param("password")String password);
  }
