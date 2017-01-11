package org.livvy.reading.service.impl;

import org.livvy.reading.domain.User;
import org.livvy.reading.mapper.UserMapper;
import org.livvy.reading.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/1/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

}
