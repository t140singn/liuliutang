package com.liuliutang.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
