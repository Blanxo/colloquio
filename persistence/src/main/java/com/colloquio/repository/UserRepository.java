package com.colloquio.repository;

import com.colloquio.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {

    String SELECT_FROM_USER = "SELECT * FROM user";

    String SELECT_FROM_USER_WHERE_USERNAME = "SELECT * FROM user WHERE username = #{username}";

    @Select(SELECT_FROM_USER_WHERE_USERNAME)
    User findUserByUsername(String username);


    @Insert("INSERT INTO user(username, email, name, surname) " +
            " VALUES (#{username}, #{email}, #{name}, #{surname})")
    void insert(User user);

    @Select(SELECT_FROM_USER)
    List<User> findAll();

    String SELECT_FROM_USER_WHERE_ID = "SELECT * FROM user WHERE id = #{id}";

    @Select(SELECT_FROM_USER_WHERE_ID)
    User findById(long id);
}
