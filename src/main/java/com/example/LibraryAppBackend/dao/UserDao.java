package com.example.LibraryAppBackend.dao;

import com.example.LibraryAppBackend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<User,Integer> {
    @Query(value = "SELECT `id`, `aadhar`, `address`, `confirm`, `dob`, `email`, `name`, `password`, `phone`, `pincode`, `username` FROM `user_reg` WHERE `email`= :email AND `password`= :password",nativeQuery = true)
    List<User> UserLogin(@Param("email") String email, @Param("password") String password);
}