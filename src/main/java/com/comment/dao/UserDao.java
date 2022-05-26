package com.comment.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comment.entities.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}