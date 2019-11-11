package com.zsh.service;

import com.zsh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(String username, String password) {
        userMapper.save(username,password);
    }
}
