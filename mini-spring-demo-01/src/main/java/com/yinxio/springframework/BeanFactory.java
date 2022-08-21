package com.yinxio.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 *BeanFactory，代表了Bean对象的工厂，可以存放Bean定义到Map中以及获取
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 获取
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
