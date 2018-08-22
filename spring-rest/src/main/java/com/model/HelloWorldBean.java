/*
 * Copyright Notice
 * ================
 * This file contains proprietary information of Discovery Health.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018.
 */
package com.model;

import java.util.StringJoiner;

/**
 * TODO - Add some information about the class.
 *
 * @author Rahul Vij
 */
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HelloWorldBean.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .toString();
    }
}
