package com.yinxio.springframework.beans.factory.support;

import com.yinxio.springframework.beans.BeansException;
import com.yinxio.springframework.beans.factory.BeanFactory;
import com.yinxio.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 * 注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
