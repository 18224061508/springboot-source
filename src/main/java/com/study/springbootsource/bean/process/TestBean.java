package com.study.springbootsource.bean.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements InitializingBean, DisposableBean, ApplicationContextAware {

    private String name;
    private int age;

    public TestBean() {
        System.out.println("TestBean->constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("TestBean->setter");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("TestBean->setter");
        this.age = age;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean->destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean->afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext var1) throws BeansException{
        System.out.println("TestBean->setApplicationContext");
    }


}
