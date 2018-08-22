package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestfulWebservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulWebservicesApplication.class, args);
    }

    @Bean
    public LocaleResolver localeResolver() {
        //  SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        //sessionLocaleResolver.setDefaultLocale(Locale.US);

        //return sessionLocaleResolver;

        AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
        acceptHeaderLocaleResolver.setDefaultLocale(Locale.US);
        return acceptHeaderLocaleResolver;
    }


}
