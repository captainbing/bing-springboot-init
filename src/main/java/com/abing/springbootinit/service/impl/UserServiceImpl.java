package com.abing.springbootinit.service.impl;

import com.abing.springbootinit.mapper.UserMapper;
import com.abing.springbootinit.model.entity.User;
import com.abing.springbootinit.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author CaptainBing
 * @Date 2023/11/8 22:24
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
