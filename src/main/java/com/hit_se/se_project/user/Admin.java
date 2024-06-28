package com.hit_se.se_project.user;

import com.hit_se.se_project.controller.Connector;
import com.hit_se.se_project.controller.UserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

public class Admin extends User {
    public Admin(String name, String password, boolean permission) {
        super(name, password, permission);
        type = "admin";
    }
}
