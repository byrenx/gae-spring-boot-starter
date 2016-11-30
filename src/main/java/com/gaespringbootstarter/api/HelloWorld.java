package com.gaespringbootstarter.api;

import com.gaespringbootstarter.dto.Hello;
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Hello helloWorldJSON() {
        Hello h = new Hello();

        h.setMessage("Test JSON");
        return h;
    }


}
