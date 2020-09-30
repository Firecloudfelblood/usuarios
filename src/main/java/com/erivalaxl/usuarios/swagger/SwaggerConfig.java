//package com.erivalaxl.usuarios.swagger;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    public static final Contact DEFAULT_CONTACT = new Contact("Erivalaxl", "http://localhost:8761/eureka",
//            "inggyovannycavazos@gmail.com");
//    public static final List<VendorExtension> vendorExtensions = new ArrayList<>();
//
//    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
//            "Control de usuarios",
//            "Este servicio se encarga de operaciones crud de usuarios",
//            "1.0",
//            "Terminos de servicios",
//            DEFAULT_CONTACT,
//            "MIO NO TOCAR",
//            "http//esmio.nolopresto.ynodoylisencia.deuso",
//            vendorExtensions
//    );
//
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(DEFAULT_API_INFO)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .build();
//    }
//}
