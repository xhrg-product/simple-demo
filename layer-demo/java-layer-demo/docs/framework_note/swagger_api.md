#### 备注

访问：http://127.0.0.1:8080/demo-service/swagger-ui.html
说明：端口是spring-boot配置默认端口，demo-service是content-path


#### swagger相关配置

添加依赖
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.5.0</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

增加配置代码
```
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${spring.application.name}")
    private String name;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.github.xhrg.demo.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(name)
                .contact(new springfox.documentation.service.Contact("张三", "https://github.com/xhrg-demo/layer-demo", "634789257@qq.com"))
                .version("1.0")
                .description("API 描述")
                .build();
    }
}
```

### 注意点

如果使用了spring环绕，ResponseBodyAdvice，一定要配置包路径，防止swagger接口被环绕调。