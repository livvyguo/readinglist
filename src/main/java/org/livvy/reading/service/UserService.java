package org.livvy.reading.service;

import org.livvy.reading.domain.User;

import java.util.List;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/1/6.
 */
public interface UserService {
    List<User> selectUser();
}
