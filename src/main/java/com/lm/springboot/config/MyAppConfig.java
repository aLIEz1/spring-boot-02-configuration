package com.lm.springboot.config;

import com.lm.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author super
 *
 * Configuration指明这是一个配置类就是来替代之前的Spring配置文件
 *
 * 在配置文件中用<bena><bean/>标签添加组件
 */
@Configuration
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中
     * 容器中这个组件默认的id就是这个方法名 helloService01
     * @return HelloService()
     */
    @Bean
    public HelloService helloService01(){
        System.out.println("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}
