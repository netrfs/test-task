package com.test.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : liuda
 * @date :  2021/1/8  18:01
 * @description :
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "success";
    }
}
