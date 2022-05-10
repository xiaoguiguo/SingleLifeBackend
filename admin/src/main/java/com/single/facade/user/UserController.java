package com.single.facade.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserController
 * @author: doudou
 * @datetime: 2022/5/10
 * @description: TODO
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("username")
    public String getUserName() {
        return "test";
    }
}
