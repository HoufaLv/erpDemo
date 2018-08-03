package com.lv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by houfalv on 2018/7/24.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String index() throws IOException {
        throw new IOException("hehe");
    }
}
