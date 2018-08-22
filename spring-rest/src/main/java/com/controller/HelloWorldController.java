/*
 * Copyright Notice
 * ================
 * This file contains proprietary information of Discovery Health.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018.
 */
package com.controller;

import com.model.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * TODO - Add some information about the class.
 *
 * @author Rahul Vij
 */
@RestController
@RequestMapping(path = "HelloWorld")
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello")
    public HelloWorldBean helloWorld() {
        return new HelloWorldBean("Hello Rahul");
    }

    @GetMapping(path = "/hello/{userid}")
    public HelloWorldBean helloWorld(@PathVariable Long userid) {
        return new HelloWorldBean("Hello Rahul " + userid);
    }

    @GetMapping(path = "/hello-internationalized")
    public HelloWorldBean helloInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return new HelloWorldBean(messageSource.getMessage("good.morning.message", null, locale));

    }

    @GetMapping(path = "/hello-internationalized1")
    public HelloWorldBean helloInternationalized1() {
        return new HelloWorldBean(messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale()));

    }
}
