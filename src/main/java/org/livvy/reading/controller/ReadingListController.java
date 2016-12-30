package org.livvy.reading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by livvy (livvyguo@gmail.com) on 2016/12/30.
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "livvy");
        return "index";
    }

}
