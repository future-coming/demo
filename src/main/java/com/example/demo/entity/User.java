package com.example.demo.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_user")
@Data
public class User {
    private  Integer id;
    private String name;
    private String password;
}
