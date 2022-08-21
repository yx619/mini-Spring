package com.yinxio.springframework.beans.factory;

import com.yinxio.springframework.beans.BeansException;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
