package com.study.springbootsource.ImportRegistrar;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableImportConfig {
}

