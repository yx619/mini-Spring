package com.yinxio.springframework.beans.factory.config;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 * bean的简单定义,用于定义Bean实例化信息，现在的实现是以一个Object存放对象
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
