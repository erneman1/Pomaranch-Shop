package ua.pomaranch.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("index");
        registry.addViewController("/size-guide").setViewName("size-guide");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/contacts").setViewName("contacts");
    }
}
