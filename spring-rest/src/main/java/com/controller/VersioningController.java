/*
 * Copyright Notice
 * ================
 * This file contains proprietary information of Discovery Health.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018.
 */
package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO - Add some information about the class.
 *
 * @author Rahul Vij
 */
@RestController
public class VersioningController {

    // Versioning using the header param start.
    @GetMapping(value = "/person/name", headers = "X-API-VERSION=1")
    public String getName1() {
        return "Rahul";
    }

    @GetMapping(value = "/person/name", headers = "X-API-VERSION=2")
    public String getName2() {
        return "Rahul Vij";
    }
    // Versioning using the header param end.

    // Versioning using the produces/accept header/mime type start.
    @GetMapping(value = "/person/produces", produces = "application/appV1")
    public String producesName1() {
        return "Rahul";
    }

    @GetMapping(value = "/person/produces", produces = "application/appV2")
    public String producesName2() {
        return "Rahul Vij";
    }
    // Versioning using the produces/accept header/mime type end.

}
