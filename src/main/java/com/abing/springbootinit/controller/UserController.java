package com.abing.springbootinit.controller;

import com.abing.springbootinit.common.BaseResponse;
import com.abing.springbootinit.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author CaptainBing
 * @Date 2023/11/8 22:10
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public BaseResponse<String> testGet(){
        return ResultUtils.success("你好");
    }
}
