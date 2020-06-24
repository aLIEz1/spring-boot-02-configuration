package com.lm.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author super
 * <p>
 * 将配置文件中的每一个值映射到这个组件中
 * ConfigurationProperties 作用为告诉Spring Boot将本类中的所有属性
 * 和配置文件中的值进行绑定参数prefix = "person"为前缀，说明要绑定哪个属性
 * 只有这个组件是容器中的组件才能使用容器提供的功能
 * Validated 注解 数据类型和值校验
 * <p>
 * 如果说，我们只是在某个业务逻辑中需要获取一下配置文件的某项值，使用@Value
 * 如果说，我们专门编写了一个javaBean来和配置文件进行映射，我们直接使用@ConfigurationProperties
 * <p>
 * ConfigurationProperties默认从全局配置文件获取值
 * <p>
 * PropertySource(value={"classpath:person.properties"})加载指定的配置文件
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String lastName;
    private Integer age;
    private boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
