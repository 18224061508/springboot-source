package com.study.springbootsource.ImportRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(
            AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        registry.registerBeanDefinition(User.class.getName(), bdb.getBeanDefinition());

    }
}
