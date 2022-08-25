### 使用mybatis


1. 增加依赖
```
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>${spring-boot-mybatis.version}</version>
</dependency>
```

2. 增加配置mapper注解：

@MapperScan(basePackageClasses = MapperPackage.class)

3. 增加数据库配置：
```
spring:
  application:
    name: "demo-service"
  datasource:
    url: "jdbc:mysql://localhost/demo_db"
    username: "root"
    password: "123456"
```
4. 编写mapper，然后spring注入即可使用。

### 使用mybatis-plus

1. 增加依赖