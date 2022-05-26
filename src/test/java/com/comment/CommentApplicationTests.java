package com.comment;

import com.comment.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CommentApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.getById(1));
    }
}