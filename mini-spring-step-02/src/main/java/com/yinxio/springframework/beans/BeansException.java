package com.yinxio.springframework.beans;

/**
 * @author yinxiong
 * @date 2022年08月21日 14:23
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
