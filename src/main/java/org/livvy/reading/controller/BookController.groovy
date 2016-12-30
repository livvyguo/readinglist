package org.livvy.reading.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by livvy (livvyguo@gmail.com) on 2016/12/30.
 */
@Controller
@RequestMapping("book")
class BookController {

    @RequestMapping("index")
    def index() {
        return "book/index"
    }
}
