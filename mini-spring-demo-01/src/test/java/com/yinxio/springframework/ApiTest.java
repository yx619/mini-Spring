package com.yinxio.springframework;

import com.yinxio.springframework.BeanFactory;
import com.yinxio.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Author yinxiong
 * @date 2022年08月21日 14:26
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
