package org.livvy.reading.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.livvy.reading.domain.User;
import org.livvy.reading.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/3/3.
 *
 * @author livvy
 * @date 2017/03/03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {


    @Autowired
    private UserService userService;

    @Test
    public void selectUser() throws Exception {

        List<User> users = userService.selectUser();
        System.out.println(users);

    }

}
