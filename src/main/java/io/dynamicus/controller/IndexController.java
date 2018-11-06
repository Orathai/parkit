package io.dynamicus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /*
     * This Controller mapping index page 'http://localhost:9000/docs/index.html' for Spring REST Docs API*/
    @RequestMapping("/docs/")
    public String index() {
        return "index";
    }
}
