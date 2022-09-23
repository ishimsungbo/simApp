package com.sim.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class SwaggerApiConfig {
    /**
    @Bean
    public Docket swaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(swaggerInfo())  // API Docu 및 작성자 정보 매핑
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sim.app.restapi.user"))
                .paths(PathSelectors.any()) //Controller 패키지 전부?
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo swaggerInfo(){
        return new ApiInfoBuilder().title("Spring API Documentation")
                .description("앱 서버 API 설명을 위한 문서")
                .license("MIT")
                .licenseUrl("https://ecolumbus.tistory.com/")
                .version("0.1")
                .build();
    }
    **/
}
