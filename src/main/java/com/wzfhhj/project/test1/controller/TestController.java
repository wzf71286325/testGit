package com.wzfhhj.project.test1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;

@RestController
public class TestController {



    @GetMapping("test/one")
    public String testOne()
    {
        Collection a = new HashSet();

        int[] b = new int[10];
        b[10] = 10;

        return "ok";
    }
}
