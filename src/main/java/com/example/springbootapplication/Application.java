package com.example.springbootapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*SpringApplication app=new SpringApplication(Application.class);
        app.setBanner((environment, sourceClass, out) -> {
            out.println("=======================");
            out.println("Code Banner");
            out.println("=======================");
        });
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);*/
        new SpringApplicationBuilder()
                .sources(Application.class)
                .banner((environment, sourceClass, out) -> {
                    out.println("=======================");
                    out.println("Builder Banner");
                    out.println("=======================");
                })
                .run(args);
    }

}
