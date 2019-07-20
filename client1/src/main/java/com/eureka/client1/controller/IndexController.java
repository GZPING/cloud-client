package com.eureka.client1.controller;

/**
 * Created by GD on 2019/7/20.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Description 测试
 * @Author GD
 * @Date 2019/7/20 17:20
 * @Version 1.0V
 */

@RestController("client1")
public class IndexController {

    @PostMapping("datainfo")
    public String datainfo(){
        return "datainfo from client 1";
    }
}
