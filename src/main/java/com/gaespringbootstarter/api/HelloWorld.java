package com.gaespringbootstarter.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by byrenx on 10/24/16.
 */
@RestController
@RequestMapping("api/helloworld")
public class HelloWorld {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }
}
