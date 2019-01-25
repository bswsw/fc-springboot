package com.baegood.fcspringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private HttpMessageConverters httpMessageConverters;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        httpMessageConverters
//            .getConverters()
//            .forEach(httpMessageConverter -> System.out.println(httpMessageConverter.getClass().getName()));
    }
}
