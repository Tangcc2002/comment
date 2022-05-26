package com.comment.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comment.dao.UserDao;
import com.comment.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}