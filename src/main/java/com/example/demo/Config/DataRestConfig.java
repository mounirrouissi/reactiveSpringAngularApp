package com.example.demo.Config;//package com.example.demo.Config;
//
//
//import com.example.demo.models.Category;
//import com.example.demo.models.interfacess.Product;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
//import org.springframework.http.HttpMethod;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//
//
//@Configuration
//public class DataRestConfig implements RepositoryRestConfigurer {
//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
////        disable http methods for products:pos put delete
//        HttpMethod[] DisHttpMethods={HttpMethod.POST,HttpMethod.DELETE,HttpMethod.PUT};
//config.getExposureConfiguration().forDomainType( Product.class )
//        .withItemExposure( (metdata, httpMethods) -> httpMethods.disable( DisHttpMethods ) )
//        .withCollectionExposure( (metdata, httpMethods) -> httpMethods.disable( DisHttpMethods ) );
////        disable http methods for category:pos put delete
//config.getExposureConfiguration().forDomainType( Category.class )
//        .withItemExposure( (metdata, httpMethods) -> httpMethods.disable( DisHttpMethods ) )
//        .withCollectionExposure( (metdata, httpMethods) -> httpMethods.disable( DisHttpMethods ) );
//    }
//}
