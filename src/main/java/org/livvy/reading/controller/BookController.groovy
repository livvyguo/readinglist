package org.livvy.reading.controller

import org.livvy.reading.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by livvy (livvyguo@gmail.com) on 2016/12/30.
 * @author livvy
 */
@Controller
@RequestMapping("book")
class BookController {

    @Autowired
    private UserService userService;


    @RequestMapping("index")
    def index() {
        return "book/index"
    }


    @ResponseBody
    @RequestMapping("user")
    def user() {
        return userService.selectUser()
    }
}
