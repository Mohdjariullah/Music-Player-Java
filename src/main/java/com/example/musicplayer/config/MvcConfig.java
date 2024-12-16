package com.example.musicplayer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

@Override
public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/css/**")
            .addResourceLocations("classpath:/static/css/");
    registry.addResourceHandler("/js/**")
            .addResourceLocations("classpath:/static/js/");
    registry.addResourceHandler("/favicon.ico")
            .addResourceLocations("classpath:/static/");
    registry.addResourceHandler("/uploads/**")
            .addResourceLocations("file:uploads/");
        registry.addResourceHandler("/2.png")
            .addResourceLocations("classpath:/static/");

}
}
