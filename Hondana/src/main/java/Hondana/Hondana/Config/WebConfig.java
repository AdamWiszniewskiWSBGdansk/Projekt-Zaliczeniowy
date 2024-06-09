package Hondana.Hondana.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // Wywoływanie plików statycznych dla MainPage
        registry.addResourceHandler("/MainPage/**")
                .addResourceLocations("classpath:/static/MainPage/");

        // Wywoływanie plików statycznych dla LoginPage
        registry.addResourceHandler("/LoginPage/**")
                .addResourceLocations("classpath:/static/LoginPage/");
    }
}
