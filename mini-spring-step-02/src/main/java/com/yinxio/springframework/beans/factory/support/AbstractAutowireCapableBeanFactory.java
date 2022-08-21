package com.yinxio.springframework.beans.factory.support;


import com.yinxio.springframework.beans.BeansException;
import com.yinxio.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
