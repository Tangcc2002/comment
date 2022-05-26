package com.comment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.annotation.Resource;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Resource
    private Integer id;

    private String name;
}