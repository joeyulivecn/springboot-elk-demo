package com.joeyu.springbootelkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/elk")
public class ELKController {
    @PostMapping("/error")
    public void createError(@RequestBody String message){
        log.error(message);
    }

    @PostMapping("/info")
    public void createInfo(@RequestBody String message){
        log.info(message);
    }

    @PostMapping("/warn")
    public void createWarn(@RequestBody String message){
        log.warn(message);
    }
}
