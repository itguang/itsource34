package com.xs.config;

import java.io.File;

import com.xs.util.PathUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//静态资源映射
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private String staticPath = PathUtil.getClassLoadRootPath() + "/src/main/resources/static/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 映射访问路径到实际的资源文件夹
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
//
//		registry.addResourceHandler("/avatar/**")
//				.addResourceLocations(("classpath:static/avatar/"));
        registry.addResourceHandler("/avatar/**")
                .addResourceLocations((("file:" + staticPath + "avatar/")));
        registry.addResourceHandler("/voice/**")
                .addResourceLocations((("file:" + staticPath + "voice/")));
//		registry.addResourceHandler("/txt/**")
//				.addResourceLocations(staticString + File.separator + "txt" + File.separator);
    }

}
