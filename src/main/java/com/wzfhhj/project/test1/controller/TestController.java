package com.wzfhhj.project.test1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {


    private void testFun()
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            System.out.println("111111111");
            list.add(i);
        }

    }

    @GetMapping("test/one")
    public String testOne()
    {
        return "ok";
    }


    public static void main(String[] args)
    {
        System.out.println("232323");

    }

    private void testMethod()
    {
        System.out.println("4444");
        System.out.println("1111111111111111");
    }



}
