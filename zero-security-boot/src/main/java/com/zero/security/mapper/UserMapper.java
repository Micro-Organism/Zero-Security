package com.zero.security.mapper;

import com.zero.security.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue May 14 16:21:03 CST 2024
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue May 14 16:21:03 CST 2024
     */
    List<User> selectAll();
    User loadUserByUsername(String username);
}