package com.yinxio.springframework.beans.factory.support;


import com.yinxio.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 * bean的简单定义,用于定义Bean实例化信息，现在的实现是以一个Object存放对象
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
